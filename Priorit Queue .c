#include<stdio.h>
#include<stdlib.h>

struct node {
    int priority;
    int info;
    struct node *next;
};

typedef struct node Node;

Node *start = NULL;

void insert() {
    int item, itprio;
    Node *new = (Node*)malloc(sizeof(Node));
    
    printf("ENTER THE ELEMENT TO BE INSERTED: ");
    scanf("%d", &item);
    printf("ENTER ITS PRIORITY: ");
    scanf("%d", &itprio);
    
    new->info = item;
    new->priority = itprio;
    new->next = NULL;

    if (start == NULL || itprio < start->priority) {
        new->next = start;
        start = new;
    } else {
        Node *q = start;
        while (q->next != NULL && q->next->priority <= itprio) {
            q = q->next;
        }
        new->next = q->next;
        q->next = new;
    }
}

void del() {
    if (start == NULL) {
        printf("\nQUEUE UNDERFLOW\n");
    } else {
        Node *temp = start;
        printf("\nDELETED ITEM IS %d\n", temp->info);
        start = start->next;
        free(temp);
    }
}

void display() {
    Node *temp = start;
    if (start == NULL) {
        printf("QUEUE IS EMPTY\n");
    } else {
        printf("QUEUE IS:\n");
        while (temp != NULL) {
            printf("%d (priority = %d)\n", temp->info, temp->priority);
            temp = temp->next;
        }
    }
}

int main() {
    int ch;
    do {
        printf("\n[1] INSERTION\t[2] DELETION\t[3] DISPLAY\t[4] EXIT\t:");
        scanf("%d", &ch);
        switch(ch) {
            case 1:
                insert();
                break;
            case 2:
                del();
                break;
            case 3:
                display();
                break;
            case 4:
                break;
            default:
                printf("Wrong choice\n");
        }
    } while (ch < 4);
    return 0;
}
