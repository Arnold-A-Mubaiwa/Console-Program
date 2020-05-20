#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class emp{
  public:
     string Name;
     int employeeNo;
     
    
    int getEmplys(){
        int NumOfEmplys;
        cout<<"***************************************************************\n";
        cout<<"How many Employees To record : ";
        cin>>NumOfEmplys;
         cout<<"***************************************************************\n";
        return NumOfEmplys;
    }
    int getEmplDetails(){
            cout<<"Enter Employee Name : ";
            cin>>Name;
            cout<<"Enter Employee Number : ";
            cin>>employeeNo;
            return employeeNo;
                }
};
class salary: public emp{
  public:
   double WorkedHours, hourlyRate, daysWorked,Salary,Taxs,UIFund=0.0,PensionFund=0.0,NetPay=0.0;
   string UIF, Pension;
   int NoEMP;
        
  private:
   double EmployeeSalary(){
        cout<<"Hours worked per day :";
        cin>>WorkedHours;
        cout<<"Hourly pay rate : ";
        cin>>hourlyRate;
        cout<<"Days Worked :";
        cin>>daysWorked;
        cout<<"UIF (y/n) :";
        cin>>UIF;
        cout<<"Pension (y/n) : ";
        cin>>Pension;

        Salary = WorkedHours * hourlyRate * daysWorked;
         Taxs = Salary * 0.16;
          if(UIF =="y"|| UIF=="Y"){
            UIFund = Salary * 0.01;
        }else{
            UIFund = 0;
        }
        if(Pension=="y"||Pension=="Y"){
            PensionFund = Salary*0.05;
        }else{
            PensionFund = 0;
        }
        return Salary;
    }
    
    double calculateNet(){
        double NetPay = Salary - Taxs - UIFund - PensionFund;
        return NetPay;
    }
    void DisplayInfo(){
        cout<<"\n***************************************************************\n";
        cout<<"Name : "<<Name<<"\n";
        cout<<"Employee No : "<<employeeNo<<"\n";
        cout<<"Salary : "<< Salary<<"\n";
        cout<<"UIF(1%) : " << UIFund<<"\n";
        cout<<"Pension(5%) : "<< PensionFund<<"\n";
        cout<<"Taxs(16%)  : "<< Taxs<<"\n";
    }

    public:
    
    void TotalNet(){
         NoEMP = getEmplys();
        double GetNet[NoEMP];
        double GetSalary[NoEMP];
        int GetEmployeeID[NoEMP];
        for (int i = 0; i < NoEMP; i++)
        {
            GetEmployeeID[i]=
            getEmplDetails();
            GetSalary[i]=  EmployeeSalary();
            GetNet[i]= calculateNet();
            DisplayInfo();
            cout<<"Net Salary : "<< GetNet[i];
             cout<<"\n***************************************************************\n";
        }
         cout<<"Employ No"<<setw(12)<<"Salary"<<setw(15)<<"Net Pay\n";
         cout<<"***************************************************************\n";
         double totalNet =0;
         double totalSalary =0.0;
        for (int i = 0; i < NoEMP; ++i)
        {
           cout<<GetEmployeeID[i]<<setw(15)<<GetSalary[i]<<setw(15)<<GetNet[i]<<"\n";
           totalSalary+=GetSalary[i];
           totalNet+=GetNet[i];
        }
        cout<<"\n***************************************************************\n";
        cout<<NoEMP<<setw(20)<<totalSalary<<setw(15)<<totalNet;
        cout<<"\n***************************************************************\n";
    }
};

int main(){
    salary employee;
    employee.TotalNet();
    return 0;
}