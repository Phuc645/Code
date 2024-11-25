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

Node *create_Node(int data)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}

LinkedList *create_List()
{
    LinkedList *list = (LinkedList *)malloc(sizeof(LinkedList));
    list->head = NULL;
    return list;
}

void display_list(LinkedList *list)
{
    printf("Linked List: ");
    Node *current = list->head;
    if (current == NULL)
    {
        printf("Empty");
        return;
    }

    while (current != NULL)
    {
        printf("%d->", current->next);
        current = current->next;
    }
    printf("NULL\n");
}

void detele_tail(LinkedList *list)
{
    if (list->head != NULL)
    {
        Node *current = list->head;
        Node *prev = NULL;
        while (current->next != NULL)
        {
            prev = current;
            current = current->next;
        }
        if (prev != NULL)
        {
            prev->next = NULL;
        }
        else
        {
            list->head = NULL;
        }
        free(current);
    }
}

int countItems(LinkedList *list)
{
    int count = 0;
    Node *current = list->head;
    while ((current != NULL))
    {
        count++;
        current = current->next;
    }
    return count;
}


void insert_head(LinkedList *list, Node *new_node)
{
    new_node->next = list->head;
    list->head = new_node;
}

int main()
{
    LinkedList *list = create_List();
    int S[5] = {1, 3, 5, 2, 7};
    for (int i = 4; i >= 0; i--)
    {
        Node *node = create_Node(S[i]);
        insert_head(list, node);
    }
    display_list(list);
    printf("Count of nodes is %d", countItems(list));
}