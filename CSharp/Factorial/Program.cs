using System;

namespace Factorial
{
    class Factorial{
        int factor;
        int answer = 1;
        public int Factor{
            get{
                return factor;
            }
            set{
                factor =value;
            }
        }
        public void getFactorial(){
            for (int currentValue = factor; currentValue >0; currentValue--)
            {
                 answer*=currentValue;
            }
            Console.WriteLine("The factorial of {0} is {1}",factor,answer);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Factorial number = new Factorial();
            Console.Write("Enter your factorial : ");
            number.Factor= Convert.ToInt32(Console.ReadLine());
            number.getFactorial();
        }
    }
}
