import java.util.Scanner;

public class Atm {

public  void work(Accountt account) {
		
		
	Login login = new Login();                        
		
	Scanner scanner = new Scanner (System.in);
		
	System.out.println(" WELCOME ");
	System.out.println(" ****************** ");
	System.out.println(" User Login ");
	System.out.println(" ****************** ");
		
	int right_of_entry = 3;
		
	while (true) {
		                                   
			
		if (login.Login(account)) {
				
		System.out.println("Login successful");
		break;
		
		}
		
		else {
			
		System.out.println("Login failed");
		
		right_of_entry -=1;            
		
		System.out.println("Remaining right of entry : " + right_of_entry);
				
		}
			
		if (right_of_entry == 0) {
			
		System.out.println("Your right to enter is finished!!");
				
		return;  
		}
		}
		
	
      System.out.println(" ******************************** "); 
	
      String transactions = "1.Operation : Balance Display\n "
                           +"2.Operation : Withdraw Money\n"
	                   +"3.peration : Deposit Money\n"
	                   +"Exit : q";
      System.out.println(transactions);
      System.out.println(" ********************************* ");
      
      
   while(true) {                                          
    		
     System.out.print("Enter the transaction number: " );
     String operation = scanner.nextLine();
    		 
    	if (operation.equals("q")) {
    			 
    	     break;
    	}
    		 
    	else if (operation.equals("1")) {
    		
    	System.out.println("Current balance: " +account.getbalance());
    		
    		
    	}
    	else if (operation.equals("2")) {
    			
        System.out.println("The amount you want to withdraw: ");
    	    
    	int amount = scanner.nextInt();
    	scanner.nextLine();	              
    		
    	account.withdraw_money(amount);
    	}
    		   
    	else if (operation.equals("3")) {
    			
    	System.out.println("The amount you want to deposit: ");
    		
    	int amount = scanner.nextInt();
    	scanner.nextLine();
    			
    	account.deposit_money(amount);
    	}
    	
    	else {
    			
    	System.out.println("Ýnvalid transaction!");
    	}
    		
   }
   
}}


