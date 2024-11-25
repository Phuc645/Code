#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    struct Node *left;
    int data;
    struct Node *right;
} Node;

typedef struct BST
{
    Node *root;
} BST;

Node *createNode(int data)
{
    Node *node = (Node *)malloc(sizeof(Node));
    node->left = NULL;
    node->data = data;
    node->right = NULL;
    return node;
}

BST *createBinaryTree()
{
    BST *tree = (BST *)malloc(sizeof(BST));
    tree->root = NULL;
    return tree;
}

void processNode(Node *node)
{
    printf("%d ", node->data);
}

void inOrderTraverse(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    inOrderTraverse(root->left);
    processNode(root);
    inOrderTraverse(root->right);
}

Node *insertNode(Node *root, Node *node)
{
    if (root == NULL)
    {
        return node;
    }
    if (node->data < root->data)
    {
        root->left = insertNode(root->left, node);
    }
    else if (node->data > root->data)
    {
        root->right = insertNode(root->right, node);
    }
    return root;
}

Node *search(Node *root, int data)
{
    if (root == NULL)
    {
        return NULL;
    }
    if (root->data == data)
    {
        return root;
    }
    if (data < root->data)
    {
        return search(root->left, data);
    }
    return search(root->right, data);
}

int Min(Node *root) {
    Node *current = root;
    while(current->left != NULL) {
        current = current->left;
    }
    return current->data;
}

Node *Delete(Node *root, int data)
{
    if (root == NULL)
    {
        return NULL;
    }
    if (data < root->data)
    {
        root->left = Delete(root->left, data);
    }
    else if (data > root->data)
    {
        root->right = Delete(root->right, data);
    }
    else
    {
        if (root->left == NULL && root->right == NULL)
        {
            free(root);
            return NULL;
        }
        if (root->left == NULL)
        {
            Node *temp = root->right;
            free(root);
            return temp;
        }
        if (root->right == NULL)
        {
            Node *temp = root->left;
            free(root);
            return temp;
        }
        int min = Min(root->right);
        root->data = min;
        root->right = Delete(root->right, min);
    }
    return root;
}


int main()
{
    BST *b = createBinaryTree();
    int a[] = {1,2,3,4,5,6,7,8,9};
    for (int i = 0; i < 9; i++) {
        Node *node = createNode(a[i]);
        b->root = insertNode(b->root, node);
    }
    inOrderTraverse(b->root);
    Delete(b->root,5);
    inOrderTraverse(b->root);
}