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

void preOrder(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    processNode(root);
    preOrder(root->left);
    preOrder(root->right);
}

Node *insertNode(BST *tree, Node *node)
{
    if (tree->root == NULL)
    {
        tree->root = node;
        return node;
    }
    Node *current = tree->root;
    Node *parent = NULL;
    while (current != NULL)
    {
        parent = current;
        if (node->data < current->data)
        {
            current = current->left;
        }
        else
        {
            current = current->right;
        }
        if (node->data < parent->data)
        {
            parent->left = node;
        }
        else
        {
            parent->right = node;
        }
    }
}

Node *search(Node *root, int data) {
    Node *current = root;
    while (current!= NULL) {
        if (current->data == data) {
            return current;
        } else if(data < current->data) {
            current = current->left;
        } else {
            current = current->right;
        }
    }
    return NULL;
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



int countNodes(Node *root) {
    if (root == NULL) {
        return 0;
    }
    return 1 + countNodes(root->left) + countNodes(root->right);
}

int getHeight(Node *root) {
    if (root == NULL) {
        return 0;
    }
    int leftHeight = getHeight(root->left);
    int rightHeight = getHeight(root->right);
    return 1 + ((leftHeight > rightHeight)? leftHeight : rightHeight);
}

int main() {
    BST *tree = createBinaryTree();
    int a[] = {3,5,2,0,6,8,4,1};
    for (int i = 0; i < 8; i++) {
        Node *node = createNode(a[i]);
        insertNode(tree, node);
    }
    Node *root;
    printf("Pre-order traversal: ");
    preOrder(tree->root);
    printf("\n");
    printf("Number of nodes : %d",countNodes(root));
}