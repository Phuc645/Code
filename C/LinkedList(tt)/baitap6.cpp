#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int number;
    int power;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
} LinkedList;

LinkedList *create_list()
{
    LinkedList *list = (LinkedList *)malloc(sizeof(LinkedList));
    list->head = NULL;
    return list;
}

Node *create_node(int number, int power)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->number = number;
    new_node->power = power;
    new_node->next = NULL;
    return new_node;
}

void insert_poly1(LinkedList *list1, Node *new_node)
{
    new_node->next = list1->head;
    list1->head = new_node;
}

void insert_poly2(LinkedList *list2, Node *new_node)
{
    new_node->next = list2->head;
    list2->head = new_node;
}

void display_poly1(LinkedList *list1)
{
    Node *current = list1->head;
    while (current != NULL)
    {
        printf("%dx^%d + ", current->number, current->power);
        current = current->next;
    }
    printf("0\n");
}

void display_poly2(LinkedList *list2)
{
    Node *current = list2->head;
    while (current != NULL)
    {
        printf("%dx^%d + ", current->number, current->power);
        current = current->next;
    }
    printf("0\n");
}

void sum_poly(LinkedList *list1, LinkedList *list2)
{
    Node *current1 = list1->head;
    Node *current2 = list2->head;
    int sum = 0;
    while (current1 != NULL && current2 != NULL)
    {
        if (current1->power == current2->power)
        {
            sum = current1->number + current2->number;
            printf("%dx^%d + ", sum, current1->power);
            current1 = current1->next;
            current2 = current2->next;
        }
        else if (current1->power > current2->power)
        {
            current1 = current1->next;
        }

        else if (current1->power < current2->power) {
            current2 = current2->next;
        }
    }
    printf("0");
}
int main()
{
    LinkedList *list2 = create_list();
    LinkedList *list1 = create_list();
    // Node *node = create_node(1, 0);
    // insert_poly1(list1, node);
    // Node *node1 = create_node(7, 1);
    // insert_poly1(list1, node1);
    // Node *node2 = create_node(9, 2);
    // insert_poly1(list1, node2);
    // Node *node3 = create_node(6, 3);
    // insert_poly1(list1, node3);
    // Node *node4 = create_node(2, 0);
    // insert_poly2(list2, node4);
    // Node *node5 = create_node(0, 1);
    // insert_poly2(list2, node5);
    // Node *node6 = create_node(-5, 2);
    // insert_poly2(list2, node6);
    // Node *node7 = create_node(1, 3);
    // insert_poly2(list2, node7);
    // display_poly1(list1);
    // display_poly2(list2);
    // sum_poly(list1, list2);
}
