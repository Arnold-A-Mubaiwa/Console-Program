using System;
using System.Text;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace GradesFinalAverage
{
    class Grades
    {
        char LetterGrade;
        int[,] StudentMark;
        float[] StudentAverage;
        int NumOfStudents;
        int Subjects;
        int TotalMark = 0;
        int[] GradeDistribution = new int[11];
        string[] OverRall = {
            "  0-9", "10-19", "20-29", "30-39",
            "40-49", "50-59", "60-69", "70-79",
            "80-89", "90-99", "  100"
        };
        public void finalGrades()
        {
            GetGrades();
            EachStudentAverage();
            classAverage();
        }
        public void DistributionChart()
        {
            for (int getStudent = 0; getStudent < NumOfStudents; getStudent++)
            {
                //Subject=GradeDistribution[a.a];
                for (int getMark = 0; getMark < Subjects; getMark++)
                {
                    int SM = StudentMark[getStudent, getMark];
                    if (SM == 100)
                    {
                        GradeDistribution[10] += 1;
                    }
                    else if (99 >= SM && SM >= 90)
                    {
                        GradeDistribution[9] += 1;
                    }
                    else if (89 >= SM && SM >= 80)
                    {
                        GradeDistribution[8] += 1;
                    }
                    else if (79 >= SM && SM >= 70)
                    {
                        GradeDistribution[7] += 1;
                    }
                    else if (69 >= SM && SM >= 60)
                    {
                        GradeDistribution[6] += 1;
                    }
                    else if (59 >= SM && SM >= 50)
                    {
                        GradeDistribution[5] += 1;
                    }
                    else if (49 >= SM && SM >= 40)
                    {
                        GradeDistribution[4] += 1;
                    }
                    else if (39 >= SM && SM >= 30)
                    {
                        GradeDistribution[3] += 1;
                    }
                    else if (29 >= SM && SM >= 20)
                    {
                        GradeDistribution[2] += 1;
                    }
                    else if (19 >= SM && SM >= 10)
                    {
                        GradeDistribution[1] += 1;
                    }
                    else if (9 >= SM && SM >= 0)
                    {
                        GradeDistribution[0] += 1;
                    }
                }
            }
            // displaying the distribution
            Console.WriteLine();
            for (int GradeLevel = 0; GradeLevel < OverRall.Length; GradeLevel++)
            {
                Console.Write(OverRall[GradeLevel] + " : ");
                int CurreneLevel = GradeDistribution[GradeLevel];
                for (int DistributionAmount = 0; DistributionAmount < CurreneLevel; DistributionAmount++)
                {
                    Console.Write("*");
                }
                Console.Write("\n");
            }
        }
        public int getMin()
        {
            // int themin = StudentMark.Min();
            // Console.Write(themin+"\n");
            int minValue = 0;
            for (int Student = 0; Student < NumOfStudents; Student++)
            {
                for (int Grade = 0; Grade < Subjects; Grade++)
                {
                    if (Student == 0 && Grade == 0)
                    {
                        minValue = StudentMark[0, 0];
                    }
                    else
                    {
                        if (StudentMark[Student, Grade] < minValue)
                        {
                            minValue = StudentMark[Student, Grade];
                        }
                    }
                }
            }
            return minValue;
        }
        public int getMax()
        {
            int maxValue = 0;
            for (int Student = 0; Student < NumOfStudents; Student++)
            {
                for (int Grade = 0; Grade < Subjects; Grade++)
                {
                    if (Student == 0 && Grade == 0)
                    {
                        maxValue = StudentMark[0, 0];
                    }
                    else
                    {
                        if (StudentMark[Student, Grade] > maxValue)
                        {
                            maxValue = StudentMark[Student, Grade];
                        }
                    }
                }
            }
            return maxValue;
        }
        void EachStudentAverage()
        {
            Console.Write("\t");
            for (int i = 0; i < Subjects; i++)
            {
                Console.Write("\tTest {0}", i + 1);
            }
            Console.Write("\tAverage\n");
            for (int getStudent = 0; getStudent < NumOfStudents; getStudent++)
            {
                Console.Write("Student {0} : ", getStudent + 1);
                for (int getMark = 0; getMark < Subjects; getMark++)
                {
                    Console.Write("\t{0}", StudentMark[getStudent, getMark] + " ");
                }
                Console.Write("\t{0} \n", StudentAverage[getStudent]);
            }
        }
        void classAverage()
        {
            double overallAverage;
            double totalAverage = 0.0;
            for (int eachStudAver = 0; eachStudAver < StudentAverage.Length; eachStudAver++)
            {
                totalAverage += StudentAverage[eachStudAver];
            }
            overallAverage = totalAverage / StudentAverage.Length;
            Console.WriteLine("\nOVERALL AVERAGE : {0}", overallAverage);
        }

        bool validateGrades(int mark)
        {
            if (mark >= 0 && mark <= 100)
            {
                return true;
            }
            else
            {
                Console.WriteLine("The Grade Value Should be less than 100 and greater than 0");
                return false;
            }
        }
        void GetGrades()
        {
            Console.Write("How many Students do you want to record : ");
            NumOfStudents = Convert.ToInt16(Console.ReadLine());
            Console.Write("How many Grades per student, you want to record : ");
            Subjects = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine();
            int Students = NumOfStudents;
            StudentMark = new int[Students, Subjects];
            StudentAverage = new float[NumOfStudents];
            for (Students = 0; Students < NumOfStudents; Students++)
            {
                for (int GradeMark = 0; GradeMark < Subjects; GradeMark++)
                {
                    Console.Write("Enter Grade {0} For Student {1} : ", GradeMark + 1, Students + 1);
                    int mark = Convert.ToInt32(Console.ReadLine());
                
                    if (validateGrades(mark) == true)
                    {
                        StudentMark[Students, GradeMark] = mark;
                        TotalMark += mark;
                    }
                    else
                    {
                        Console.Write("Enter Grade {0} For Student {1} : ", GradeMark + 1, Students + 1);
                        mark = Convert.ToInt32(Console.ReadLine());
                        if (validateGrades(mark) == true)
                        {
                            StudentMark[Students, GradeMark] = mark;
                            TotalMark += mark;
                        }
                    }
                }
                float AVRG = TotalMark/Subjects;
                StudentAverage[Students] = AVRG;
                if (StudentAverage[Students] <= 100 && StudentAverage[Students] >= 90)
                {
                    LetterGrade = 'A';
                }
                else if (StudentAverage[Students] <= 89 && StudentAverage[Students] >= 80)
                {
                    LetterGrade = 'B';
                }
                else if (StudentAverage[Students] <= 79 && StudentAverage[Students] >= 70)
                {
                    LetterGrade = 'C';
                }
                else if (StudentAverage[Students] <= 69 && StudentAverage[Students] >= 60)
                {
                    LetterGrade = 'D';
                }
                else if (StudentAverage[Students] <= 59 && StudentAverage[Students] >= 0)
                {
                    LetterGrade = 'F';
                }
                Console.WriteLine("--------------------------------------------------------");
                Console.WriteLine("Total Mark : {0} | Average : {1} | CODE : {2}", TotalMark, StudentAverage[Students], LetterGrade);
                Console.WriteLine("--------------------------------------------------------\n");
                TotalMark = 0;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Grades student = new Grades();
            student.finalGrades();
            int min = student.getMin();
            int max = student.getMax();
            Console.WriteLine("\nLowest Grade : {0}", min);
            Console.WriteLine("Highest Grade : {0}", max);
            student.DistributionChart();
        }
    }
}