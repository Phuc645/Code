#include <stdio.h>
#include <stdlib.h>

#define MAX 100

typedef struct Stack
{
    int data[MAX];
    int top;
} Stack;

Stack *create_stack()
{
    Stack *stack = (Stack *)malloc(sizeof(Stack));
    stack->top = -1;
    return stack;
}

void init(Stack *stack) {
    stack->top = -1;
}

bool is_empty(Stack *stack) {
    return stack->top == -1;
}

bool is_full(Stack *stack) {
    return stack->top == MAX - 1;
}

bool push(Stack *stack, int value) {
    if(is_full(stack)) {
        return false;
    }
    stack->top++;
    stack->data[stack->top] = value;
    return true;
}

int pop(Stack *stack) {
    if(is_empty(stack)) {
        return -1;
    }
    int data = stack->data[stack->top];
    stack->top--;
    return data;
}

int get_top(Stack *stack) {
    if(is_empty(stack)) {
        return -1;
    }
    return stack->data[stack->top];
}

void display(Stack *stack) {
    if(is_empty(stack)) {
        printf("Stack is empty\n");
        return;
    }
    printf("Stack: ");
    for (int i = 0; i <= stack->top; i++) {
        printf("%d -> ",stack->data[i]);
    }
    printf("NULL\n");
}

int main() {
    Stack *stack = create_stack();
    push(stack,12);
    push(stack,45);
    push(stack,37);
    push(stack,25);
    push(stack,58);
    pop(stack);
    display(stack);
}
