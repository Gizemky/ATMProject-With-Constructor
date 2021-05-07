import java.util.Scanner;

public class Atm {

public  void work(Accountt account) {
		
		
	Login login = new Login();          // logini kontrol edece�imiz i�in login class'�ndan bir obje olu�turuyoruz.
		
	Scanner scanner = new Scanner (System.in);
		
	System.out.println(" WELCOME ");
	System.out.println(" ****************** ");
	System.out.println(" User Login ");
	System.out.println(" ****************** ");
		
	int right_of_entry = 3;
		
	while (true) {
		                                   //atm.work ald��� bilgileri a�a��ya g�nderecek.Ve ko�ula g�re e�er do�ru ise true de�er yanl�� ise false de�er d�nd�relecek
			
		if (login.Login(account)) {
				
		System.out.println("Login successful");
		break;
		
		}
		
		else {
			
		System.out.println("Login failed");
		
		right_of_entry -=1;            // giri� hakk�n� azalt�yoruz.
		
		System.out.println("Remaining right of entry : " + right_of_entry);
				
		}
			
		if (right_of_entry == 0) {
			
		System.out.println("Your right to enter is finished!!");
				
		return;  //break yaparsak sadece d�ng� sonlan�r. Bu y�zden return yaz�yoruz.
		}
		}
		
	
      System.out.println(" ******************************** "); //login i�leminden sonra kullan�c�dan yapmak istedi�i i�lemi almal�y�z bu y�zden i�lemler de�i�kenimizi olu�turduk.
      
      String transactions = "1.Operation : Balance Display\n "
                           +"2.Operation : Withdraw Money\n"
	                       +"3.peration : Deposit Money\n"
	                       +"Exit : q";
      System.out.println(transactions);
      System.out.println(" ********************************* ");
      
      
   while(true) {                                          //D�ng� true olduk�a devam edecek kullan� q de�erini girene kadar.
    		
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
    	scanner.nextLine();	              //�nt de�eri ald�ktan sonra d�ng� ba�a d�n�p bakiye soracak bunun �n�ne ge�mek i�in bu i�lemi yapt�k.
    		
    	account.withdraw_money(amount);
    	}
    		   
    	else if (operation.equals("3")) {
    			
    	System.out.println("The amount you want to deposit: ");
    		
    	int amount = scanner.nextInt();
    	scanner.nextLine();
    			
    	account.deposit_money(amount);
    	}
    	
    	else {
    			
    	System.out.println("�nvalid transaction!");
    	}
    		
   }
   
}}


