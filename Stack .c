#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *link;
};

struct node *top = NULL;

void pop();
void push(int value);
void display();

int main() {
    int choice, data;

    while (1) {
        printf("\n1. Push\n2. Pop\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter a new element: ");
                scanf("%d", &data);
                push(data);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}

void display() {
    struct node *temp = top;

    if (temp == NULL) {
        printf("\nStack is empty\n");
        return;
    }

    printf("\nThe contents of the stack are:");
    while (temp != NULL) {
        printf(" %d ->", temp->data);
        temp = temp->link;
    }
    printf(" NULL\n");
}

void push(int data) {
    struct node *temp = (struct node *)malloc(sizeof(struct node));

    if (temp == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }

    temp->data = data;
    temp->link = top;
    top = temp;

    display();
}

void pop() {
    if (top != NULL) {
        printf("The popped element is %d\n", top->data);
        struct node *temp = top;
        top = top->link;
        free(temp);
    } else {
        printf("Stack underflow\n");
    }

    display();
}
