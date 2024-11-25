#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
} LinkedList;

Node *create_node(int data)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}

LinkedList *create_list()
{
    LinkedList *list = (LinkedList *)malloc(sizeof(LinkedList));
    list->head = NULL;
    return list;
}

void display_list(LinkedList *list)
{
    printf("Linked list: ");
    Node *current = list->head;
    if (current == NULL)
    {
        printf("Empty");
        return;
    }

    while (current != NULL)
    {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

void sort(LinkedList *list)
{
    Node *current = list->head;
    while (current != NULL)
    {
        Node *min_node = current;
        Node *temp = current->next;
        while (temp != NULL)
        {
            if (temp->data < min_node->data)
            {
                min_node = temp;
            }
            temp = temp->next;
        }
        int t = current->data;
        current->data = min_node->data;
        min_node->data = t;
        current = current->next;
    }
}
void insert_head(LinkedList *list, Node *new_node)
{
    new_node->next = list->head;
    list->head = new_node;
}

int main()
{
    LinkedList *list = create_list();
    int S[5] = {8,3,4,1,7};
    for (int i = 4; i >= 0; i--)
    {
        Node *node = create_node(S[i]);
        insert_head(list, node);
    }
    sort(list);
    display_list(list);
}