using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace USCoinSystem
 {
    class ComputeMaximum {
        double MaxNum;
        const double nickel = 0.05;
        const double dime = 0.10;
        const double quater = 0.25;
        const double half = 0.50;
        public double HalfDollars (int Amount) {
            MaxNum = Amount / half;
            return MaxNum;
        }
        public double Quarters (int Amount) {
            MaxNum = Amount / quater;
            return MaxNum;
        }
        public double Dimes (int Amount) {
            MaxNum = Amount / dime;
            return MaxNum;
        }
        public double Nickels (int Amount) {
            MaxNum = Amount / nickel;
            return MaxNum;
        }
    }
    class Program {
        static void Main (string[] args) {
            ComputeMaximum getMax = new ComputeMaximum ();
             excecute:
            try {
               
                Console.Write ("Enter the amount you want to CHANGE : $");
                int Dollars = Convert.ToInt32 (Console.ReadLine ());

                Console.WriteLine ("The maximum number of HALF-DOLLARS that can be used is : {0}", getMax.HalfDollars (Dollars));
                Console.WriteLine ("The maximum number of QUATERS that can be used is : {0}", getMax.Quarters (Dollars));
                Console.WriteLine ("The maximum number of DIMES that can be used is : {0}", getMax.Dimes (Dollars));
                Console.WriteLine ("The maximum number of NICKELS that can be used is : {0}", getMax.Nickels (Dollars));
                
            } catch (System.Exception) {
                Console.WriteLine ("INVALID VALUE!! Please enter an \"INTEGER\"\n");
                goto excecute;
            }
        }
    }
}