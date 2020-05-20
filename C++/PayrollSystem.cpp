#include <iostream>
#include <string>
using namespace std;

class emp{
  
   public:
     string name,surname,accountNo;
    void getInfo(){
            cout<<"Enter Employee Name : ";
            cin>>name;
            cout<<"Enter Employee Surname : ";
            cin>>surname;
            cout<<"Enter The Account Name : ";
            cin>>accountNo;
                }
};
class salary: public emp{
  public:
   double hoursWorked, hourlyRate, daysWorked,Salary,Tax;
   double UIFund=0.0,PensionFund=0.0,NetPay=0.0;
   string UIF, Pension;
  private:
   void getSalary(){
        cout<<"Enter hours worked per day :";
        cin>>hoursWorked;

        if (hoursWorked<=0.0 && hoursWorked>=24.0)
        {
            hoursWorked = 0.0;
            cout<<"Enter hours between 1 and 24!!\n";
            cout<<"Enter hours worked per day : ";
            cin>>hoursWorked;
        }
        
        cout<<"Enter hourly pay rate : ";
        cin>>hourlyRate;
        cout<<"Enter days Worked :";
        cin>>daysWorked;
        cout<<"UIF (YES/NO) :";
        cin>>UIF;
        cout<<"Pension (YES/NO) : ";
        cin>>Pension;

        Salary = hoursWorked * hourlyRate * daysWorked;
         Tax = Salary * 0.15;
          if(UIF =="yes"|| UIF=="Yes"|| UIF=="YES"){
            UIFund = Salary * 0.01;
        }else{
            UIFund = 0;
        }
        if(Pension=="yes"||Pension=="Yes"||Pension=="YES"){
            PensionFund = Salary*0.05;
        }else{
            PensionFund = 0;
        }
    }
    
    double calculateNet(){
        double NetPay = Salary - Tax - UIFund - PensionFund;
        return NetPay;
    }
    void DisplayInfo(){
        cout<<"\n==============================================\n";
        cout<<"Name and Surname : "<< name << " "<<surname<<"\n";
        cout<<"Account No : "<<accountNo<<"\n";
        cout<<"Salary : "<< Salary<<"\n";
        cout<<"UIF(1%) : " << UIFund<<"\n";
        cout<<"Pension(5%) : "<< PensionFund<<"\n";
        cout<<"Tax(15%)  : "<< Tax<<"\n";
        cout<<"Net Salary : "<< calculateNet();
        cout<<"\n==============================================\n";
    }

    public:
    void getNetPay(){
        getInfo();
        getSalary();
        DisplayInfo();
    }
};

int main(){
    salary employee;
    employee.getNetPay();
    return 0;
}