#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int number;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
} LinkedList;

Node *create_node(int number)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->number = number;
    new_node->next = NULL;
    return new_node;
}

LinkedList *create_list()
{
    LinkedList *list = (LinkedList *)malloc(sizeof(LinkedList));
    list->head = NULL;
    return list;
}

void insert_head(LinkedList *list, Node *new_node)
{
    new_node->next = list->head;
    list->head = new_node;
}

void display_list(LinkedList *list)
{
    Node *current = list->head;
    while (current != NULL)
    {
        printf("%d -> ", current->number);
        current = current->next;
    }
    printf("NULL\n");
}

void find_max(LinkedList *list)
{
    Node *current = list->head;
    int max = current->number;
    while (current != NULL)
    {
        if (max < current->number)
            max = current->number;
        current = current->next;
    }
    printf("Max number is: %d\n", max);
}

void find_min(LinkedList *list)
{
    Node *current = list->head;
    int min = current->number;
    while (current != NULL)
    {
        if (min > current->number)
           min = current->number;
        current = current->next;
    }
    printf("Min number is: %d", min);
}


int main()
{
    LinkedList *list = create_list();
    int S[5] = {3, 4, 6, 1, 5};
    for (int i = 0; i < 5; i++)
    {
        Node *node = create_node(S[i]);
        insert_head(list, node);
    }
    display_list(list);
    find_max(list);
    find_min(list);
}