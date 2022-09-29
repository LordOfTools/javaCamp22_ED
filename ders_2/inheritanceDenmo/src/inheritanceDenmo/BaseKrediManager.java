package inheritanceDenmo;

public class BaseKrediManager extends BasedCalculator {

private	double inCome ;
private	double outCome ;
private	int time ;
private	double creditPoint ;
private	double balance ;
private	double miktar ;
//private	double a = 1;
//private	double b = 1;
//private	String faiz = "";

	public double getInCome() {
		return inCome;
	}

	public void setInCome(double inCome) {
		this.inCome = inCome;
	}

	public double getOutCome() {
		return outCome;
	}

	public void setOutCome(double outCome) {
		this.outCome = outCome;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getCreditPoint() {
		return creditPoint;
	}

	public void setCreditPoint(double creditPoint) {
		this.creditPoint = creditPoint;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMiktar() {
		return miktar;
	}

	public void setMiktar(double miktar) {
		this.miktar = miktar;
	}

	/*public double getA() {
		return a;
	}

	

	public double getB() {
		return b;
	}


	public String getFaiz() {
		return faiz;
	}

	*/

	public void Hesapla() {
	double a ;
	double b ;
	String faiz ;
	
		a = Bol(Cikar(inCome, outCome), miktar);
		b = Bol(Carp(creditPoint, balance), time);
		faiz=("%0,"+a+b);

		System.out.println("|Kredi hesaplandı. Faiz oranı :" + faiz + " olarak belirlendi|");

	}

}
