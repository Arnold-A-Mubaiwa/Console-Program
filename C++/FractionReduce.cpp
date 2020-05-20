#include <iostream>
using namespace std;
class Reduced
{
    int top, bot;
    void getReducedFraction(int numerator, int denominator, int commonDivisor)
    {
        if (numerator % commonDivisor == 0 && denominator % commonDivisor == 0 && commonDivisor != 1)
        {
            top = numerator / commonDivisor;
            bot = denominator / commonDivisor;
            commonDivisor = 1;
        }
        else
        {
            commonDivisor = 1;
           
        }
    }
    public:
    int reduce(int num, int denom)
    {
        if (num > denom && num != 0 && denom != 0)
        {
            for (int CD = num; CD > 0; CD--)
            {
                 getReducedFraction(num,denom,CD);
            }
             cout << "\nThe actual Fraction is: " << num << "/" << denom << "\n";
             cout << "The Reduced Fraction is: "<< top << "/" << bot << "\n\n";
            return 1;
        }
        else if (denom > num && denom != 0 && num != 0)
        {
            for (int CD = denom; CD > 0; CD--)
            {
                getReducedFraction(num,denom,CD);
            }
            cout << "\nThe actual Fraction is: " << num << "/" << denom << "\n";
             cout << "The Reduced Fraction is: "<< top << "/" << bot << "\n\n";
            return 1;
        }
        else
        {
            cout << "Fraction error \n ";
            return 0;
        }
    }
};
int main()
{
    Reduced r;
    r.reduce(60, 5);
    return 0;
}