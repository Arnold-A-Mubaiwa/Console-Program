#include <iostream>
using namespace std;
struct Node {
   int inputData;
   struct Node *nxt;
};
struct Node* top = NULL;
void pushing(int val) {
   struct Node* newN = (struct Node*) malloc(sizeof(struct Node));
   newN->inputData = val;
   newN->nxt = top;
   top = newN;
}
void popping() {
   if(top==NULL)
   cout<<"Stack Underflow"<<endl;
   else {
      cout<<"The popped element is "<< top->inputData <<endl;
      top = top->nxt;
   }
}

Node* SortedMerge(Node* a, Node* b) 
{ 
    Node* result = NULL; 
    if (a == NULL) 
        return (b); 
    else if (b == NULL) 
        return (a); 
  
    if (a->inputData <= b->inputData) { 
        result = a; 
        result->nxt = SortedMerge(a->nxt, b); 
    } 
    else { 
        result = b; 
        result->nxt = SortedMerge(a, b->nxt); 
    } 
    return (result); 
} 
void FrontBackSplit(Node* source, 
                    Node** frontRef, Node** backRef) 
{ 
    Node* fast; 
    Node* slow; 
    slow = source; 
    fast = source->nxt; 
 
    while (fast != NULL) { 
        fast = fast->nxt; 
        if (fast != NULL) { 
            slow = slow->nxt; 
            fast = fast->nxt; 
        } 
    } 

    *frontRef = source; 
    *backRef = slow->nxt; 
    slow->nxt = NULL; 
}  
void SortedList(Node** headRef) 
{ 
    Node* head = *headRef; 
    Node* a; 
    Node* b; 
  
    if ((head == NULL) || (head->nxt == NULL)) { 
        return; 
    } 

    FrontBackSplit(head, &a, &b); 
  
    SortedList(&a); 
    SortedList(&b); 
  
    *headRef = SortedMerge(a, b); 
} 
void display() {
   struct Node* ptr;
   if(top==NULL)
   cout<<"stack is empty";
   else {
      ptr = top;
      SortedList(&ptr);
      cout<<"Stack elements are: ";
      while (ptr != NULL) {
         cout<< ptr->inputData <<" ";
         ptr = ptr->nxt;
      }
   }
   cout<<endl;
}
int main() {
   int ch, val;
   cout<<"1) Push in stack"<<endl;
   cout<<"2) Pop from stack"<<endl;
   cout<<"3) Display stack"<<endl;
   cout<<"4) Exit"<<endl;
   do {
      cout<<"Enter choice: "<<endl;
      cin>>ch;
      switch(ch) {
         case 1: {
            cout<<"Enter value to be pushed:"<<endl;
            cin>>val;
            pushing(val);
            break;
         }
         case 2: {
            popping();
            break;
         }
         case 3: {
            display();
            break;
         }
         case 4: {
            cout<<"Exit"<<endl;
            break;
         }
         default: {
            cout<<"Invalid Choice"<<endl;
         }
      }
   }while(ch!=4);
   return 0;
}

