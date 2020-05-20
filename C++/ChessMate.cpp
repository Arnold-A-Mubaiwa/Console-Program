#include <iostream>
using namespace std;

int main(){
    for(int i= 0;i<=8;i++){
        for(int c = 0; c<=8; c++){
            int a=i+c;
            if(a%2==0){
                cout<<" * ";
            }else{
                cout<<"   ";
            }
        }
        cout<<"\n";
    }
}