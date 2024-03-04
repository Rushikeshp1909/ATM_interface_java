package ATMInterface;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements ATMOperationInterf {
  
	ATM atm = new ATM();
   
   Map<Double,String>ministmt=new HashMap<>();
   
	@Override
	public void viewBalance() {
      System.out.println("Available Balance is : "+atm.getBalance());		
	}

	@Override
	public void withdrawMoney(double withdrawMoney) {
		if(withdrawMoney%500==0){
		if(withdrawMoney<=atm.getBalance())
		{
			ministmt.put(withdrawMoney," Amount withdrawn");
			System.out.println("Please collect your Cash : "+withdrawMoney);
			atm.setBalance(atm.getBalance()-withdrawMoney);
			viewBalance();
		}
		else
		{
			System.out.println("Insufficient Balance !!");

		}
	}
		else
		{
			System.out.println("Please Enter the Amount in Multiple of 500");
		}
	}
	
	@Override
	public void depositeMoney(double depositeMoney) {
		ministmt.put(depositeMoney," Amount Deposited");
		System.out.println(depositeMoney+" Deposited Sucessfully !!\n");
		atm.setBalance(atm.getBalance()+depositeMoney);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
