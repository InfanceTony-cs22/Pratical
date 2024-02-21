#include<stdio.h>
#include<conio.h>

void main() {
    int a[10], i, n, m, c = 0;
    
    printf("Enter the size of an array: ");
    scanf("%d", &n);
    
    printf("Enter the elements of the array: ");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);
    
    printf("Enter the number to be searched: ");
    scanf("%d", &m);
    
    for(i = 0; i < n; i++) {
        if(a[i] == m) {
            printf("Element is in the position %d\n", i + 1);
            c = 1;
            break;
        }
    }
    
    if(c == 0)
        printf("The number is not in the list\n");
}
