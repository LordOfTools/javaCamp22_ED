package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		
		//!!!Değişken isimlendirmeleri java'da camelCase yazılıyor buna dikkat!!!
		
		String ortaMetin = "ananas";
		String altMetin = "mango";
		
		System.out.println(ortaMetin);
				
		int normalSayı = 5; //ondalıklı olamaz reel olmak zorunda
				
		double dolarDün = 18.14;
		
		double dolarBugün = 18.10;
		
		boolean dolarDustuMu = false;
		String drum = "bekleniyor";
		
		
		if (dolarBugün<dolarDün) { dolarDustuMu = true; drum = "düştü";
			
		                   } 
		
		else if (dolarBugün>dolarDün) { drum = "yükseldi"; dolarDustuMu = false;
			
		}
		                    else { drum = "aynı morq";
			
			
		                         }
	
		System.out.println(drum);
	
	
		//array veri_türü [] liste_adı = {liste}; 0,1,2,3,4 -----> DataBaseden gelicek bilgiler
		
		String [] rapSozleri = {"Gucci","Prada","Rolex","mercedes"};
	
		//System.out.println(rapSozleri[0]);
		//System.out.println(rapSozleri[2]);
		//System.out.println(rapSozleri[3]);
		
		
		 for (int i = 0 ; i < rapSozleri.length; i++ ) {
			 
			 System.out.println(rapSozleri[i]);
		 }
		
		
		 	int sayi1=210;
	        int sayi2=214;
	        int toplam1=0;
	        int toplam2=0;

	        for (int i =1; i<sayi1;i++){
	            if(sayi1%i==0){
	                toplam1+=i;
	            }
	        }
	        for (int i =1; i<sayi2;i++){
	            if(sayi2%i==0){
	                toplam2+=i;
	            }
	        }
	        if (sayi1==toplam2 && sayi2==toplam1){
	            System.out.println("İki Sayı Arkadaştır");
	        }else {
	        	System.out.println("İki Sayı Arkadaş Değildir");
	        }
	        
	        
	
	        
	        
	        String[] ogrenci = new String[4];
	        
	         ogrenci[0] = "Farah";
	         ogrenci[1] = "Percy";
	         ogrenci[2] = "Kübra";
	         ogrenci[3] = "Ces";

	        String[] sinif = new String[4];

	        sinif[0]="1.sınıf";
	        sinif[1]="2.sınıf";
	        sinif[2]="3.sınıf";
	       // sinif[3]="4.sınıf";
	        for (int i=0;i< sinif.length;i++){
	            System.out.println(sinif[i]);
	        }
	System.out.println("-----------------------------------------------------");


	        String[] ogrenciler={"Farah","Kübra","Ces","Percy"};

	        for(String ogrencisay:ogrenciler) {
	            System.out.println(ogrencisay);

	        }

	        for (int i=0;i< sinif.length;i++){
	            sinif[i]=ogrenciler[i];
	        }


	        for(String asd:ogrenciler){
	            for (int i = 0; i< sinif.length;i++){
	                sinif[i]=asd;
	                System.out.println(sinif[i]);
	            }

	        }
	        
	        
	        
	        
	        for (int i=0;i<=10;i++){
	            System.out.println(i);
	        }
	        System.out.println("sıralama bitti");
	        System.out.println("------------------------------");

	        for (int i=0;i<=10;i+=2){
	            System.out.println(i);
	        }

	        System.out.println("çift sıralama bitti");
	        System.out.println("------------------------------");

	        for (int i=1;i<=10;i+=2){
	            System.out.println(i);
	        }

	        System.out.println(" tek sıralama bitti");
	        System.out.println("------------------------------");


	        //WHİLE
	        int i=0;
	        while (i<10){
	            System.out.println(i);
	            i++;
	        }
	        System.out.println(" while sıralama bitti");
	        System.out.println("------------------------------");

	        int k=0;
	        while (k<10){
	            System.out.println(k);
	            k+=2;
	        }

	        System.out.println(" while çift sıralama bitti");
	        System.out.println("------------------------------");

	        int j=1;
	        while (j<=10){
	            System.out.println(j);
	            j+=2;
	        }
	        System.out.println(" while tek sıralama bitti");
	        System.out.println("------------------------------");



	        //DO-WHİLE

	            int z=1;
	            do {
	                z=z+500;
	                System.out.println(z);
	                z+=2;

	            }while (z<10);
	            System.out.println("Do-WHİLE DÖNGÜSÜ BİTTİ");
	        
	        
	        
	        
	        
	        
	            int sayi4= 24;
	            int sayi5= 25;
	            int sayi6= 2;
	            int buyuk= sayi4;

	            if (buyuk<sayi5){
	                buyuk=sayi5;
	            }
	            if (buyuk<sayi6) {
	                buyuk=sayi6;

	            }
	            System.out.println("En buyuk"+ buyuk);
	        
	        
	        
	            int[] dizi=new int[]{1,3,2,7,9,0};
	            int aranan=7;

	            for (int x=0;x< dizi.length;i++){
	                if (dizi[x]==aranan){
	                    System.out.println("Aranan sayı dizide "+ (x+1) +".sırada mevcuttur");
	                }
	            }
	
		 
		 
	            double[] dizi1={1.2,1.3,4.3,5.6};
	            double toplam=0;
	            double maks=0;

	            for (double temp:dizi1){

	                toplam+=temp;
	                if (temp>maks){
	                    maks=temp;
	                }

	            }
	            System.out.println(toplam);
	            System.out.println(maks);
		 
		 
		 
	            int[][] deneme= new int[3][3];

	            deneme[0][0]=1;
	            deneme[0][1]=3;
	            deneme[0][2]=5;
	            deneme[1][0]=7;
	            deneme[1][1]=9;
	            deneme[1][2]=11;
	            deneme[2][0]=13;
	            deneme[2][1]=17;
	            deneme[2][2]=19;
	            int tplm=0;
	            for (int a=0;a<=2;a++){

	                System.out.println((a+1)+".sütunun toplamı:");
	                for (int b=0;b<=2;b++){
	                    tplm=tplm+deneme[a][b];

	                }
	                System.out.println(tplm);
	                System.out.println("---------------------------");
	            }
	            
	            
		 
		 
		 
	            int[] dzi=new int[]{1,3,2,7,9,0};
	            int lknf=7;

	            for (int p=0;p< dzi.length;p++){
	                if (dzi[p]==lknf){
	                    System.out.println("Aranan sayı dizide "+ (p+1) +".sırada mevcuttur");
	                }
	            }
		 
		 
		 
	            char harf = 'c';

	            switch (harf){

	                case 'A':
	                case 'E':
	                case 'I':
	                case 'İ':
	                case 'O':
	                case 'Ö':
	                case 'U':
	                case 'Ü':
	                    System.out.println("Sesli Harftir");
	                    break;
	                default:System.out.println("Sesli Harf Değildir");

	            }
		 
	            int sayi=28; //Ciresun
	            int sum=1;
	            int[] bolenler=new int[]{};

	            for (int n = 1; n<sayi;n++){
	                if (sayi%n==0){
	                    sum+=n;
	                }

	            }

	            if (sum==sayi){
	              System.out.println("Mükemmel Sayıdır");
	             } else {
	            	 System.out.println("Mükemmel Sayı değildir");
	             }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	}
	

}
