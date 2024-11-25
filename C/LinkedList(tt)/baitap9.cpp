#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    struct Node *prev;
    int data;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
}LinkedList;

Node *create_node(int data)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->prev = NULL;
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

void insert_head(LinkedList *list, Node *new_node)
{
    new_node->next = list->head;
    list->head = new_node;
}

void display_list(LinkedList *list) {
    Node *current = list->head;
    while (current != NULL)
    {
        printf("%d <-> ",current->data);
    }
    printf("NULL\n");
}

int main() {
    LinkedList *list = create_list();
    int s[5] = {1,3,4,2,6};
    for (int i = 5;i > 0;i--) {
        Node *node = create_node(s[i]);
        insert_head(list,node);
    }
    display_list(list);
}