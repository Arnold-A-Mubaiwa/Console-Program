using System;

namespace Armstrong
{
    class Program
    {
        static void Main(string[] args)
        {
    //         int  n,r,sum=0,temp;      
    //    Console.Write("Enter the Number= ");      
    //    n= int.Parse(Console.ReadLine());     
    //    temp=n;      
    //    while(n>0)      
    //    {      
    //     r=n%10;      
    //     sum=sum+(r*r*r);      
    //     n=n/10;      
    //      Console.WriteLine("r {0}. sum{1}. n{2}",r,sum,n);   
    //    }      
    //    if(temp==sum)      
    //     Console.Write("Armstrong Number.");      
    //    else      
    //     Console.Write("Not Armstrong Number.");      
    //   }
    Console.Write("Enter a value");
        int num= Convert.ToInt32(Console.ReadLine());
        string numToString= Convert.ToString(num);
        Char[] nums = numToString.ToCharArray();
        int total = 0;
        int answer;
        foreach (var item in nums)
        {
            Console.WriteLine(item);
            int currentValue = Convert.ToInt16(item);
            Console.WriteLine(currentValue);
            answer= currentValue*currentValue*currentValue;
            total+=answer;
            answer=0;
        }
        Console.WriteLine(total);
        }  
        
    }
}
