package metod2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(mesaj);
		int yeniMesaj1 = topla(5,5);
		System.out.println(yeniMesaj1);
		System.out.println(yeniMesaj);
		System.out.println(topla2(5,5,5,5));
		
		ekle();
		sil();
		guncelle();
		
		
	}

	public static void ekle() {
		System.out.println("eklendi");

	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {

		System.out.println("güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}

	
	public static int topla2(int... sayilar) {
		
		int toplam = 0 ;
		for (int sayi: sayilar) {
			
			toplam+=sayi; //toplam=toplam+sayi demek
			
		}
	return toplam;
	
	
	
	
	}
	
	
	
	
	public static String sehirVer() {
		return "Ankara";
	}

}
