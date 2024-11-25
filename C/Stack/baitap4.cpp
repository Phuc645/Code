#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    char data;
    struct Node *next;
} Node;

typedef struct Stack
{
    Node *top;
}Stack;

Node *create_node (int data) {
    Node *node = (Node*)malloc(sizeof(Node));
    node->data = data;
    node->next = NULL;
    return node;
}

Stack *create_stacK() {
    Stack *stack = (Stack*)malloc(sizeof(Stack));
    stack->top = NULL;
    return stack;
}

bool is_empty(Stack *stack) {
    return stack->top == NULL;
}

void push(Stack *stack, Node *node) {
    node->next = stack->top;
    stack->top = node;
}

Node *pop(Stack *stack) {
    Node *current = NULL;
    if(!is_empty(stack)) {
        current = stack->top;
        stack->top = current->next;
    }
    return current;
}

Node *get_top(Stack *stack) {
    return stack->top;
}

void display(Stack *stack) {
    if(is_empty(stack)) {
        printf("There's nothing here");
        return;
    } 
    printf("Stack: ");
    Node *current = stack->top;
    while(current != NULL) {
        printf("%c",current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    Stack *stack = create_stacK();
    char a[] = "Hello World";
    for (int i = 0; i < 12; i++) {
        Node *node = create_node(a[i]);
        push(stack,node);
    }
    pop(stack);
    display(stack);
}