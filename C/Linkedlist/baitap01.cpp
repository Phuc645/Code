#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    char data;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
} LinkedList;


Node *create_node(char data)
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
        printf("Empty\n");
        return;
    }

    while (current != NULL)
    {
        printf("%c -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

Node *search(LinkedList *list, char value)
{
    Node *current = list->head;
    while (current != NULL)
    {
        if (current->data == value)
        {
            return current;
        }
        current = current->next;
    }
    return NULL;
}

void insert_head(LinkedList *list, Node *new_node)
{
    new_node->next = list->head;
    list->head = new_node;
}

void insert_tail(LinkedList *list, Node *new_node) {
    if(list->head == NULL) {
        list->head = new_node;
    } else {
        Node *current = list->head;
        while(current->next != NULL) {
            current = current->next;
        }
        current->next = new_node;
    }
}

void delete_head(LinkedList *list)
{
    if (list->head != NULL)
    {
        Node *current = list->head;
        list->head = current->next;
        free(current);
    }
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

int main()
{
    LinkedList *list = create_list();
    char a[5] = {'F', 'D', 'A', 'C', 'D'};
    for (int i = 4; i >= 0; i--)
    {
        Node *node = create_node(a[i]);
        insert_head(list, node);
    }
    display_list(list);
}