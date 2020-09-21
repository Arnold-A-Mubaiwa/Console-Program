#include <iostream>
using namespace std;

struct complex
{
float real;
float imaginary;
}s1,s2;

int main()
{

float a,b;
cout<<"Enter real and imaginary part of 1st complex number:";
cin>>s1.real>>s1.imaginary;
cout<<"Enter real and imaginary part of 2nd complex number:";
cin>>s2.real>>s2.imaginary;

//Addition
a=(s1.real)+(s2.real);
b=(s1.imaginary)+(s2.imaginary);
cout<<"Addition: "<<a<<" + "<<b<<"i\n";

//Multiplication
a=((s1.real)*(s2.real))-((s1.imaginary)*(s2.imaginary));
b=((s1.real)*(s2.imaginary))+((s2.real)*(s1.imaginary));
cout<<"Multiplication: "<<a<<" + "<<b<<"i\n";

}