#include <iostream>
using namespace std;

class rectangeArea
{
public:
	double RecLength, RecWidth;
	rectangeArea(double length, double width){
		RecWidth= width;
		RecLength= length;
	}
	
	double Area(){
		double area;
		area = RecLength* RecWidth;
		return area;
	}
};
int main(){
	rectangeArea recA(15.1,21.3);
	rectangeArea recB(7,6);

	cout<<recA.Area()<<"\n";
	cout<<recB.Area()<<"\n";
}