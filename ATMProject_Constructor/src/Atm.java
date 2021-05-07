import java.util.Scanner;

public class Atm {

public  void work(Accountt account) {
		
		
	Login login = new Login();          // logini kontrol edeceðimiz için login class'ýndan bir obje oluþturuyoruz.
		
	Scanner scanner = new Scanner (System.in);
		
	System.out.println(" WELCOME ");
	System.out.println(" ****************** ");
	System.out.println(" User Login ");
	System.out.println(" ****************** ");
		
	int right_of_entry = 3;
		
	while (true) {
		                                   //atm.work aldýðý bilgileri aþaðýya gönderecek.Ve koþula göre eðer doðru ise true deðer yanlýþ ise false deðer döndürelecek
			
		if (login.Login(account)) {
				
		System.out.println("Login successful");
		break;
		
		}
		
		else {
			
		System.out.println("Login failed");
		
		right_of_entry -=1;            // giriþ hakkýný azaltýyoruz.
		
		System.out.println("Remaining right of entry : " + right_of_entry);
				
		}
			
		if (right_of_entry == 0) {
			
		System.out.println("Your right to enter is finished!!");
				
		return;  //break yaparsak sadece döngü sonlanýr. Bu yüzden return yazýyoruz.
		}
		}
		
	
      System.out.println(" ******************************** "); //login iþleminden sonra kullanýcýdan yapmak istediði iþlemi almalýyýz bu yüzden iþlemler deðiþkenimizi oluþturduk.
      
      String transactions = "1.Operation : Balance Display\n "
                           +"2.Operation : Withdraw Money\n"
	                       +"3.peration : Deposit Money\n"
	                       +"Exit : q";
      System.out.println(transactions);
      System.out.println(" ********************************* ");
      
      
   while(true) {                                          //Döngü true oldukça devam edecek kullaný q deðerini girene kadar.
    		
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
    	scanner.nextLine();	              //Ýnt deðeri aldýktan sonra döngü baþa dönüp bakiye soracak bunun önüne geçmek için bu iþlemi yaptýk.
    		
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


