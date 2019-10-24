#include <stdio.h>

void hanoiTowers(int diskNum, char a, char c, char b);

int main() {

    int diskNum = 0;
    char a = 'A'; // Source
    char b = 'B'; // Auxiliary
    char c = 'C'; // Destination

    printf("Enter the number of disks :");
    scanf("%d",&diskNum);

    hanoiTowers(diskNum, a, c, b);

    return 0;
}

void hanoiTowers(int diskNum, char a, char c, char b) {
    if (diskNum == 1) {
        printf("Moving disk %d from %c to %c\n", diskNum, a, c);
    } else {
        hanoiTowers(diskNum - 1, a, b, c);
        printf("Moving disk %d from %c to %c\n", diskNum, a, c);
        hanoiTowers(diskNum - 1, b, c, a);
    }

}