using System;
using System.Text;
using System.Linq;
using System.Threading;
using System.Collections.Generic;

namespace FibonacciSeries
{
    class FibonacciSeries
    {
        public void Fibonacci(int length)
        {
            int answer = 1;
            int previousValue = 0;
            int currentValue = 0;
            for (int index = 0; index < length-2; index++)
            {
                if (index == 0)
                {
                     Console.Write(" {0}  {1} ", previousValue, answer);
                    answer += previousValue;
                    previousValue = answer;
                    Console.Write(" {0} ", answer);
                }
                else
                {
                    currentValue = answer;
                    answer += previousValue;
                    previousValue = currentValue;
                    Console.Write(" {0} ", answer);
                }
            }
            Console.WriteLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            //FibonacciSeries eg. 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
            Console.Write("Enter the length of you Series :");
            int length = Convert.ToInt32(Console.ReadLine());

            FibonacciSeries fs = new FibonacciSeries();
            fs.Fibonacci(length);

        }
    }
}
