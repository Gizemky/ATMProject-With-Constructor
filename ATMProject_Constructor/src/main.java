
public class main {

	public static void main(String[] args) {
		
		Atm atm = new Atm (); //atm objesi olu�turma.
		
		Accountt account = new Accountt ("Gizem KAYA","123456Gk",4000); //hesap objesi olu�turma.
		
		atm.work(account);        //yukar�da olu�turdu�umuz hesap objesini work metoduna  g�ndermek gerekiyor.Aksi durumda hata al�r�z.
		
		System.out.println("Exiting the program !");

	}

}
