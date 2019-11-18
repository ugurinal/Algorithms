#include <stdio.h>
#include <stdlib.h>


struct NUMBERS {
    struct NUMBERS *next;
    int data;
};

struct NUMBERS *top=NULL;

int recSearch(struct NUMBERS *list,int search){
    struct NUMBERS *head=list;

    int i;

    if(list=NULL){
        printf("Aranan sayi bagli listede bulunmamaktadir!!!");
    }

    if(search==head->data){
        printf("Listedeki elemanlarin pozitif tam sayi bolenleri:\n");
        while(top!=NULL){
            printf("%d sayisinin pozitif tam sayi bolenleri --> ",top->data );
            for(i=1;i<=top->data;i++){
                if(top->data%i==0){
                    printf("%d",i);
                }
            }
            top=top->next;
        }

    }
    else {
        return recSearch(list->next,search);
    }
}

int display(NUMBERS *list){
    NUMBERS *head=list;
    while(head!=NULL){
        printf("%d",head->data);
        head=head->next;
    }
    return 0;
}

int main(){
    NUMBERS *list=NULL;
    NUMBERS *temp=NULL;
    NUMBERS *head=NULL;
    int size,i,search;

    printf("Bagli liste kac elemandan olusacak? ");
    scanf("%d",&size);

    for(i=0;i<size;i++) {
        temp=(NUMBERS*)malloc(sizeof(NUMBERS));
        printf("%d. elemanin degerini giriniz: ",i+1);
        scanf("%d",&temp->data);
        temp->next=NULL;
        if(list==NULL){
            list=temp;
        }
        else{
            head=list;
            while(head->next!=NULL){
                head=head->next;
            }
            head->next=temp;
        }
    }
    printf("Listede aranacak degeri giriniz: ");
    scanf("%d",&search);
    top=list;
    recSearch(list,search);


    return 0;
}


