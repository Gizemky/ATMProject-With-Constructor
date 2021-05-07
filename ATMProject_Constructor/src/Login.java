import java.util.Scanner;

public class Login {

	public boolean Login(Accountt account) {
		
		Scanner scanner = new Scanner (System.in);
		String user_name;
		String password;
		
		System.out.println("USER NAME : ");
		user_name = scanner.nextLine();
		
		System.out.println("PASSWORD : ");
		password = scanner.nextLine();
		
    if (account.getuser_name().equals(user_name) && account.getpassword().equals(password)) {
			
	return true;
		}
	
    else {
    	
    return false;
    }
	}
}
