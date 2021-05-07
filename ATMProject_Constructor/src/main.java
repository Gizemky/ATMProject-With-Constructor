
public class main {

	public static void main(String[] args) {
		
		Atm atm = new Atm (); //atm objesi oluþturma.
		
		Accountt account = new Accountt ("Gizem KAYA","123456Gk",4000); //hesap objesi oluþturma.
		
		atm.work(account);        //yukarýda oluþturduðumuz hesap objesini work metoduna  göndermek gerekiyor.Aksi durumda hata alýrýz.
		
		System.out.println("Exiting the program !");

	}

}
