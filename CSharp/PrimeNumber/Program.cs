using System;

namespace PrimeNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int r = 0;
            int NonPrime = 0;

            Console.Write("Enter your number :");
            int number = Convert.ToInt32(Console.ReadLine());
            for (int currentValue = 2; currentValue < number; currentValue++)
            {
                r = number%currentValue;
                if (r==0)
                {
                    NonPrime+=1;
                }
            }
            if(NonPrime>0){
                Console.WriteLine("{0} is a Not Prime Number",number);
            }
            else{
                Console.WriteLine("{0} is a Prime Number",number);
            }
        }
    }
}
