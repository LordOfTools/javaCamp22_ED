package metod;

public class Main {

	public static void main(String[] args) {
	//ekrana yansıyan kısım
		sayiBulmaca();
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int [] {1,3,5,8,9,10};
		
		int aranacak = 5;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
				
			}
		}
		
		String mesaj="";
		
		if (varMi) {
			
			mesaj="sayı mevcut "+aranacak;
		}
		
		else {
			mesaj="sayı mevcut değil "+aranacak;
			
		}
		mesajYaz(mesaj);
	
	}
	
	
	
	public static void mesajYaz(String mesaj) {
		
		System.out.println(mesaj);
		
		
		
	}
	
	
	
}
