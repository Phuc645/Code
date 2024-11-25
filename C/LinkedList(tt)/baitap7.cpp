#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int number;
    int powerx;
    int powery;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
} LinkedList;

Node *create_node(int number, int powerx, int powery) {
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->number = number;
    new_node->powerx = powerx;
    new_node->powery = powery;
    new_node->next = NULL;
    return new_node;
}

LinkedList *create_list() {
    LinkedList *list = (LinkedList*)malloc(sizeof(LinkedList));
    list->head = NULL;
    return list;
}

void insert_poly(LinkedList *list, Node *new_node) {
    new_node->next = list->head;
    list->head = new_node;
}

void display_poly(LinkedList *list) {
    Node *current = list->head;
    while(current != NULL) {
        printf("%dx^%dy^%d + ",current->number,current->powerx,current->powery);
        current = current->next;
    }
    printf("0\n");
}

int main() {
    LinkedList *list = create_list();
    Node *node = create_node(-4,0,0);
    insert_poly(list,node);
    Node *node0 = create_node(11,1,0);
    insert_poly(list,node0);
    Node *node1 = create_node(3,1,1);
    insert_poly(list,node1);
    Node *node2 = create_node(-8,2,1);
    insert_poly(list,node2);
    Node *node3 = create_node(7,3,2);
    insert_poly(list,node3);
    display_poly(list);
}