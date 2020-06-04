using System;

// Get the number from user
// Hold the number in temporary variable
// Reverse the number
// Compare the temporary number with reversed number
// If both numbers are same, print palindrome number
// Else print not palindrome number

namespace Palindrome
{
    class Palindrome
    {
        int number;
        public int Number
        {
            get
            {
                return number;
            }
            set
            {
                number = value;
            }
        }

        public void getResult()
        {
            string NumberToString = Convert.ToString(number);
            char[] stringToArray = NumberToString.ToCharArray();
            Array.Reverse(stringToArray);
            string NumReversed = new string(stringToArray);
            int stringToNum = Convert.ToInt32(NumReversed);
            if (stringToNum == number)
            {
                Console.WriteLine(stringToNum);
                Console.WriteLine("Palindrome");
            }
            else
            {
                Console.WriteLine(NumReversed);
                Console.WriteLine("Not Palindrome");
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Palindrome num = new Palindrome();
            Console.Write("Enter your number : ");
            num.Number = Convert.ToInt32(Console.ReadLine());
            num.getResult();
        }
    }
}
