import java.util.Scanner;

public class taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bilgi = new Scanner(System.in);
		
		double ucret;
		int kısaMesafe = 20;
		int aclisUcreti = 10;
		double km = 2.5;
		double kacKm;
		while(true) {
		System.out.print("Mesafe Giriniz = ");
		System.out.println("");
		kacKm = bilgi.nextInt();
		
		
		
		if(kacKm <= 0) {
			System.out.println("İşlem İptal Edildi...");
			System.out.println("");
			
		}
		
		else if (kacKm <= 10) {
			System.out.println("Kısa Mesafe Ücreti " + "₺"+kısaMesafe);
			System.out.println("");
		}
		else{
			ucret = (kacKm*km) + aclisUcreti;
			
			System.out.println("Borcunuz = " +"₺"+ucret);
			System.out.println("");
			
			break;
		}
		
		}
		 System.out.println("Yine Bekleriz...");

	}

}
