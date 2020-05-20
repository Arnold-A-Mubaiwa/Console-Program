#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    for(int c=1; c<=10;c++){
        for(int i= 1; i<=10;i++){
                cout<<setw(4)<<i*c;
            }
    cout<<"\n";
    }
}