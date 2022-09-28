package reCapDemo_Classes;

public class DortIslem {

	public int Topla(int... sayilar) {
		
		int toplam = 0;
		
		for (int sayi : sayilar) {
			
			toplam+=sayi;
			
		}
		
		return toplam;
		
	}


	
public int Cikar(int... sayilar) {
		
		int cikan = 0;
		
		for (int sayi : sayilar) {
			
			cikan-=sayi;
			
		}
		
		return cikan;
		
	}


public int Carp(int... sayilar) {
	
	int carpim = 1;
	
	for (int sayi : sayilar) {
		
		carpim=carpim*sayi;
		
	}
	
	return carpim;
	
}





public int Bol(int... sayilar) {
	
	int bolum = 1;
	
	for (int sayi : sayilar) {
		
		bolum%=sayi;
		
	}
	
	return bolum;
	
}








}

