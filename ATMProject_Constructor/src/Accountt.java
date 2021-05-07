
public class Accountt {
	  
		private String user_name;
		private String password;
		private int balance;
		
		
public Accountt(String user_name,String password,int balance) {
			
			this.user_name = user_name;
			this.password = password;
			this.balance = balance;
		}

public void withdraw_money(int amount) {
		
	if (amount > 1500) {

	System.out.println("Your withdrawal limit is 1500 TL");
		}

	else if(balance - amount < 0) {
				
	System.out.println("You do not have enough balance");
		}

	else {

	balance -=amount;
	System.out.println("Withdrawal is successful " + balance);
		}
			
	}
public void deposit_money(int amount) {
		

	balance +=amount;
	System.out.println("Deposit is successful " +  balance);
		
	}

public String getuser_name() {
		return user_name;
	}
public void setuser_name (String user_name) {
		this.user_name = user_name;
	}

public String getpassword() {
		return password;
	}
public void setpassword (String password) {
		this.password = password;
	}

public int getbalance() {
		return  balance;
	}
public void setbalance (int balance) {
		this. balance = balance;
	}
	}



