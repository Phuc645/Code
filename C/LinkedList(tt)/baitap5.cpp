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

void insert_even(LinkedList *list1, Node *new_node)
{
    new_node->next = list1->head;
    list1->head = new_node;
}

void insert_odd(LinkedList *list2, Node *new_node)
{
    new_node->next = list2->head;
    list2->head = new_node;
}

void display_even(LinkedList *list1)
{
    printf("Even Numbers: ");
    Node *current = list1->head;
    if (current == NULL)
    {
        printf("Nothing\n");
        return;
    }

    while (current != NULL)
    {

        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

void display_odd(LinkedList *list2)
{
    printf("Odd Numbers: ");
    Node *current = list2->head;
    if (current == NULL)
    {
        printf("Nothing\n");
    }

    while (current != NULL)
    {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

int main()
{
    LinkedList *list1 = create_list();
    LinkedList *list2 = create_list();
    int S[10] = {1,2,4,3,5,6,7,8,9,10};
    for (int i = 0; i < 10; i++)
    {
        if (S[i] % 2 == 0)
        {
            Node *node = create_node(S[i]);
            insert_even(list1, node);
        }
        else
        {
            Node *node = create_node(S[i]);
            insert_odd(list2, node);
        }
    }
    display_even(list1);
    display_odd(list2);
}