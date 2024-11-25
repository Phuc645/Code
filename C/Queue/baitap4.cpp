#include <stdio.h>
#include <stdlib.h>

#define MAX 10

typedef struct queue
{
    int items[MAX];
    int front, rear;
} queue;

queue *createQueue()
{
    queue *q = (queue *)malloc(sizeof(queue));
    q->front = -1;
    q->rear = -1;
    return q;
}

bool isEmpty(queue *q)
{
    return q->front == -1;
}

bool isFull(queue *q)
{
    if (q->front == 0 && q->rear == MAX - 1)
    return true;
    if (q->front == q->rear + 1)
        return true;
    return false;
}

int enqueue(queue *q, int data)
{
    if (isFull(q))
    {
        printf("Overflow\n");
        return -1;
    }
    if (q->front == -1)
    {
        q->front = 0;
        q->rear = 0;
    }
    else if (q->rear == MAX - 1)
    {
        q->rear = 0;
    }
    else
    {
        q->rear = q->rear + 1;
    }
    q->items[q->rear] = data;
    return data;
}

int dequeue(queue *q)
{
    if (isEmpty(q))
    {
        printf("Empty\n");
        return -1;
    }
    int data = q->items[q->front];
    if (q->front == q->rear)
    {
        q->front = -1;
        q->rear = -1;
    }
    else if (q->front == MAX - 1)
    {
        q->front = 0;
    }
    else
    {
        q->front += 1;
    }
    return data;
}

void traverse(queue *q)
{
    if (isEmpty(q))
    {
        printf("Empty queue\n");
        return;
    }
    printf("Queue: ");
    if (q->front <= q->rear)
    {
        for (int i = q->front; i <= q->rear; i++)
        {
            printf("%d -> ", q->items[i]);
        }
    }
    else
    {
        for (int i = q->front; i <= MAX; i++)
        {
            printf("%d -> ", q->items[i]);
        }
        for (int i = 0; i <= q->rear; i++)
        {
            printf("%d -> ", q->items[i]);
        }
    }
    printf("\n");
}

int main() {
    queue *q = createQueue();
    enqueue(q,10);
    enqueue(q,20);
    enqueue(q,30);
    enqueue(q,40);
    enqueue(q,50);
    traverse(q);
    dequeue(q);
    traverse(q);
}