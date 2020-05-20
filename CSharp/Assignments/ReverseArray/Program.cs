using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace ReverseArray
 {
    class Program 
    {
        static float[] reverseArr;
        static void displayArr(){
            foreach (var item in reverseArr)
            {
                Console.Write(item+" : ");
            }
        }
        static public void GetArray () {

            Console.Write ("How Many Values Do You Want Your Array To Contain : ");
            int ArrayLength = Convert.ToInt32 (Console.ReadLine ());
            // Array for the values
            reverseArr = new float[ArrayLength];
            for (int a = 0; a < ArrayLength; a++) {
                Console.Write ("Enter Value Number {0} :", a + 1);
                double valueNumber = Convert.ToDouble (Console.ReadLine ());
                //explicit conversion
                float num;
                num = (float) valueNumber;
                //inserting values to the array
                reverseArr[a] = num;
            }
            Console.Write("\nThe actual Array : ");
            displayArr(); 
        }
        static public void reverse () {
            GetArray ();
            Array.Reverse(reverseArr);
            Console.Write ("\nThe reversed array : ");
            displayArr();
        }
        static void Main (string[] args) {
           try
           {
               reverse ();
           }
           catch (System.Exception)
           {
               Console.WriteLine("Write your Values in the correct format\n NB:Decimal = , ");
           }
            
        }
    }
}