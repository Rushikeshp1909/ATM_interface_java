package ATMInterface;

import java.util.Scanner;

public class Mainclass {	  
	public static void main(String[] args) {
		
	ATMOperationInterf op = new AtmOperationImpl();
	
    int userid = 321032100;
    int userpin= 1234;
    
    Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Atm Machine !!");

    System.out.print("Enter Atm Number : ");
    int UserId= sc.nextInt();
    System.out.print("Enter Pin: ");
    int UserPin=sc.nextInt();
    if((userid==UserId) && (userpin==UserPin))
    {
    	System.out.println("Authentication Sucessfull");
    	while(true)
    	{
        	System.out.println("\n1.Check Available Balance");
        	System.out.println("2.Withdraw Money");
        	System.out.println("3.Deposite Money");
        	System.out.println("4.View MiniStatement");
        	System.out.println("5.Exit\n");
        	
        	System.out.println("Enter Your Choice: ");
        	int ch=sc.nextInt();
        	
        	if(ch==1)
        	{
        		op.viewBalance();
        	}
        	else if(ch==2)
        	{
        		System.out.println("Enter Amount to withdraw : ");
        		double withdrawMoney=sc.nextDouble();
        		op.withdrawMoney(withdrawMoney);
        	}
        	else if(ch==3)
        	{
        		System.out.println("Enter Amount to Deposite : ");
        		double depositeMoney=sc.nextDouble();
        		op.depositeMoney(depositeMoney);
        	}
        	else if(ch==4)
        	{
        		op.viewMiniStatement();
        	}
        	else if(ch==5)
        	{
        		System.out.println("Please collect Your ATM Card");
        		System.out.println("Thank You for Using ATM Machine");
        		System.exit(0);
        	}
        	else
        	{
        		System.out.println("Plese Enter correct choice");
        	}
    	}
    }
         else
           {
    	System.out.println("Incorrect UserID & UserPin");
    	System.exit(0);
           }
	}
	
}
