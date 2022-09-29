package inheritanceDenmo;

public class BasedCalculator {
	
public int Topla(int... sayilar) {
		
		int toplam = 0;
		
		for (int sayi : sayilar) {
			
			toplam+=sayi;
			
		}
		
		return toplam;
		
	}


public double Topla(double... sayilar) {
	
	double toplam = 0;
	
	for (double sayi : sayilar) {
		
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


public double Carp(double... sayilar) {
	
	double carpim = 1;
	
	for (double sayi : sayilar) {
		
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


public double Cikar(double... sayilar) {
	
	double cikan = 0;
	
	for (double sayi : sayilar) {
		
		cikan-=sayi;
		
	}
	
	return cikan;
	
}


public double Bol(double... sayilar) {
	
	double bolum = 1;
	
	for (double sayi : sayilar) {
		
		bolum%=sayi;
		
	}
	
	return bolum;
	
}

}
