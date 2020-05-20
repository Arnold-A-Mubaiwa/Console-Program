#include <iostream>
#include <iomanip>
using namespace std;

float calculateCharges(float hoursParked)
{
    float chargePerHour = 4.00; //since 3 hours min = R12:00
    const float additionalPerHour = 0.90;
    const float _24hourPeriod = 20.00;
    const float maxTime = 24.00;
    float Charge;

    if (hoursParked <= maxTime && hoursParked > 0)
    {
        if (hoursParked == 24.00)
        {
            Charge = _24hourPeriod;
            cout << hoursParked << "H  |  R" << Charge << "\n\n";
        }
        else if (hoursParked == 3)
        {
            Charge = 12.00;
            cout << hoursParked << "H  |  R" << Charge << "\n\n";
        }
        else if (hoursParked > 3.00 && hoursParked < 24.00)
        {
            Charge = 12 + ((hoursParked - 3) * additionalPerHour);
            cout << hoursParked << "H  |  R" << Charge << "\n\n";
        }
        else if(hoursParked<3 && hoursParked>0){
            Charge = hoursParked * chargePerHour;
            cout << hoursParked << "H  |  R" << Charge << "\n\n";
        }
    }

    return Charge;
}
int main()
{
    float HP;
    float HoursParked[3];
    float ParkCharges[3];
    float totalHoursParked = 0.00;
    float totalCharges = 0.00;
    for (int userNumber = 0; userNumber < 3; userNumber++)
    {

        cout << "Enter Hours Parked : ";
        cin >> HP;
        if (HP <= 24.0 && HP >= 0.0)
        {
            ParkCharges[userNumber] = calculateCharges(HP);
            HoursParked[userNumber] = HP;
            totalCharges += ParkCharges[userNumber];
            totalHoursParked += HoursParked[userNumber];
        }
        else
        {
            cout << "Enter a valid Value below 24.00H \n\n";
            cout << "Enter Hours Parked : ";
            cin >> HP;
            ParkCharges[userNumber] = calculateCharges(HP);
            HoursParked[userNumber] = HP;
            totalCharges += ParkCharges[userNumber];
            totalHoursParked += HoursParked[userNumber];
        }
    }
    cout << "Car" << setw(10) << "Hours" << setw(13) << "Charges" << setw(10) << "\n";
    for (int displayUser = 0; displayUser < 3; displayUser++)
    {
        int user = displayUser + 1;

        cout << user << setw(12) << HoursParked[displayUser] << setw(12) << ParkCharges[displayUser] << "\n";
    }
    cout<<"-----------------------------------\n";
    cout << "Total" << setw(8) << totalHoursParked << setw(12) << totalCharges << "\n\n";
}
