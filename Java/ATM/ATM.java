import java.util.Scanner;

public class ATM{
	static	Double BankBalance=2400.0;

 	void checkBalance(){
		System.out.println("Bank Balance = " + BankBalance);
	}
	Double withdraw(Double withDrawAmount){
		BankBalance -= withDrawAmount;
		System.out.println("Balance is now :"+BankBalance);
		return BankBalance;
	}
	Double Deposit(Double addBalance){
		BankBalance+=addBalance;
		return BankBalance;
	}

	Double Transfer(Double transfered){
		BankBalance -= transfered;
		return BankBalance;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ATM atm = new ATM();

		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Transfer");
		System.out.println("4: Check Balance");

		System.out.print("Choose an option : " );
		int chosenValue = scan.nextInt();

		if (chosenValue==1) {
			System.out.print("Enter the amount to Deposit: ");
			double deposited = scan.nextDouble();
			atm.Deposit(deposited);
			System.out.print("Choose an option : " );
		chosenValue = scan.nextInt();
		
		}
		else if (chosenValue==2) {
			System.out.print("Enter the amount to withdraw : ");
			double drawal =  scan.nextDouble();
			atm.withdraw(drawal);
			System.out.print("Choose an option : " );
		chosenValue = scan.nextInt();
		}
		else if (chosenValue==3) {
			System.out.print("Enter the amount to Transfer: ");
			double transferrable = scan.nextDouble();
			atm.Transfer(transferrable);
			System.out.print("Choose an option : " );
		chosenValue = scan.nextInt();
		}
		else if (chosenValue==4) {
			atm.checkBalance();
			System.out.print("Choose an option : " );
		chosenValue = scan.nextInt();
		}
		else{
			atm.checkBalance();
		}
		scan.close();
	}
}