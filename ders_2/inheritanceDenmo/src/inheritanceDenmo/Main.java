package inheritanceDenmo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.setBalance(100000);
		ogretmenKrediManager.setCreditPoint(999999999);
		ogretmenKrediManager.setInCome(20000);
		ogretmenKrediManager.setOutCome(15000);
		ogretmenKrediManager.setMiktar(150000000);
		ogretmenKrediManager.setTime(12000);
		ogretmenKrediManager.Hesapla();
		
		
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		
		
		
		
	}

}
