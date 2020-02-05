import java.util.Scanner;
public class ATM {
public static void main(String [] args){
	Scanner _input=new Scanner(System.in);
	String newName=" ",newName2="";
	int newID=0,newID2=0;
	double _newBalance=0,_newBalance2=0,_newInterest=0,_newInterest2=0;
	Account Account1=new Account(newName,newID,_newBalance, _newInterest);
	Account Account2= new Account(newName2,newID2,_newBalance2,_newInterest2);
	System.out.print("Please enter an ID for the first account: ");
	newID=_input.nextInt();
	Account1.setID(newID);
	System.out.print("Now enter the name of the user for that account: ");
	newName=_input.next();
	Account1.setName(newName);
	System.out.print("What is the accounts balance?: ");
	_newBalance=_input.nextDouble();
	Account1.setBalance(_newBalance);
	System.out.print("What is the interest on the account?: ");
	_newInterest=_input.nextDouble();
	Account1.setInterest(_newInterest);
	System.out.print("Please enter an ID for the second account: ");
	newID2=_input.nextInt();
	Account2.setID(newID);
	System.out.print("Now enter the Name of the user of that account: ");
	newName2=_input.next();
	Account2.setName(newName);
	System.out.print("What is the accounts balance?: ");
	_newBalance2=_input.nextDouble();
	Account2.setBalance(_newBalance);
	System.out.print("What is the interest on the account?: ");
	_newInterest2=_input.nextDouble();
	Account2.setInterest(_newInterest);
	int _choice=1;
	while(_choice!=0){
	System.out.println("\nMain Menu" +"\n1. Account Information" + "\n2. Withdraw"+ "\n3.Deposit"+ "\n4. Exit");
	_choice=_input.nextInt();

	switch(_choice){
	case 1: System.out.print("Enter the account number: ");
	int _iDChecker=0;
	_iDChecker=_input.nextInt();
	if(_iDChecker==newID){
		System.out.println("Account Owner:"+newName + "\n"+"Balance:"+ _newBalance + "\n"+ "Interest Earned: "+ (Account1.InterestRate()));
	}
	else if(_iDChecker==newID2){
		System.out.println("Account Owner:"+newName2 + "\n"+"Balance:"+ _newBalance2 + "\n"+ "Interest Earned: " + (Account2.InterestRate()));
	}
	else{
		System.out.println("This account does not exist");
	}

	break;

	case 2:
	     _iDChecker=0;
		System.out.print("What account would you like to withdraw from?: ");
		_iDChecker=_input.nextInt();
		double _withdraw=0;
		if(_iDChecker==newID){
			System.out.print("How much would you like to withdraw?: ");
			_withdraw=_input.nextDouble();
			Account1._withdraw(_withdraw);

			System.out.println("Your new balance is: " + Account1._withdraw(_withdraw));
			_newBalance=_newBalance - _withdraw;
			Account1.setBalance(_newBalance);
			Account1.InterestRate();
		}
		else if(_iDChecker==newID2){
			System.out.print("How much would you like to withdraw?: ");
			_withdraw=_input.nextDouble();

			System.out.print("Your new balance is: " +Account2._withdraw(_withdraw));
			_newBalance2=_newBalance2 - _withdraw;
			Account1.setBalance(_newBalance2);
			Account2.InterestRate();
		}

		break;
	case 3: _iDChecker=0;
	System.out.print("What account would you like to deposit to?: ");
	_iDChecker=_input.nextInt();
	double _deposit=0;
	if(_iDChecker==newID){
		System.out.print("How much would you like to deposit?: ");
		_deposit=_input.nextDouble();
		System.out.print("Your new balance is: " + Account1._deposit(_deposit));
	_newBalance=_newBalance + _deposit;
	Account1.setBalance(_newBalance);
	}
	else if(_iDChecker==newID2){
		System.out.println("How much would you like to deposit?: ");
		_deposit=_input.nextDouble();
		System.out.println("\nYour new balance is: " + Account2._deposit(_deposit));
		_newBalance2=_newBalance2 + _deposit;
		Account1.setBalance(_newBalance2);

	}
		break;
	case 4: System.out.print("Thank you for using our ATM.");
	System.exit(0);
	break;
	default:System.out.print("That is not a valid option, please pick again: ");
	 _choice=1;
	System.out.println("Main Menu" +"\n1. Account Information" + "\n2. Withdraw"+ "\n3.Deposit"+ "\n4. Exit");
	_choice=_input.nextInt();
	}
}
}
}

