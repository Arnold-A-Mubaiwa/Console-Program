#include <iostream>
#include <math.h>
using namespace std;

int bin_to_dec(long int binary, int radix, int decimal)
{
   if(binary%10)
   {
       decimal += pow(2, radix);
       binary = (binary - 1) / 10;
       radix++;
       bin_to_dec(binary, radix, decimal);
   }
   else if(binary != 0)
   {
       binary /= 10;
       radix++;
       bin_to_dec(binary, radix, decimal);
   }
   if(binary == 0)
       return decimal;
}

int main()
{
     long long n;

    cout << "Enter a binary number: ";
    cin >> n;
   cout << n << " in binary = " << bin_to_dec(n, 0, 0) << " in decimal\n\n\n";
   return 0;
}