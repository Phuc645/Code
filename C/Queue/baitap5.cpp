#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Student
{
    int ma;
    char ht[10];
    struct Student *next;
} Student;

typedef struct Queue
{
    Student *front;
    Student *rear;
} Queue;

Student *createStudent(int ma, char ht[]) {
    Student *s = (Student *)malloc(sizeof(Student));
    s->ma = ma;
    strcpy(s->ht,ht);
    s->next = NULL;
    return s;
}

Queue *createQueue()
{
    Queue *q = (Queue *)malloc(sizeof(Queue));
    q->front = NULL;
    q->rear = NULL;
    return q;
}

bool is_empty(Queue *q) {
    return q->front == NULL;
}

void enqueue(Queue *q, Student *s) {
    if(is_empty(q)) {
        q->front = s;
    } else {
        q->rear->next = s;
    }
    q->rear = s;
}

Student *dequeue(Queue *q) {
    if(is_empty(q)) {
        printf("Empty\n");
        return NULL;
    }

    Student *current = q->front;
    q->front = q->front->next;
    if(q->front == NULL) {
        q->rear = NULL;
    }
    return current;
}

void traverse(Queue *q) {
    if(is_empty(q)) {
        printf("Empty\n");
        return;
    }
    printf("Queue: ");
    Student *current = q->front;
    while(current != NULL) {
        printf("%d - %c -> ",current->ma,current->ht);
        current = current->next;
    }
    printf("NULL\n");
}

int main () {
    Queue *q = createQueue();
    Student *s = createStudent(2230,"Hoang");
    Student *s0 = createStudent(2231,"Le");
    Student *s2 = createStudent(2232,"Nhat");
    traverse(q);
}



