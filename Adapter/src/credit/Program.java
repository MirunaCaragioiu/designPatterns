package credit;

import credit.framework_achizitionat.CreditLeasing;
import credit.framework_existent.Credit;
import credit.framework_existent.CreditNevoiPersonale;

public class Program {
	
	public static void oferaInformatiiiCredit(Credit credit) {
		credit.oferaCredit();
		System.out.println("Rata lunara: " +credit.rataLunara() );
	}

	public static void main(String[] args) {
		
		CreditNevoiPersonale creditNevoiPersonale= new CreditNevoiPersonale(4500, 5);
		oferaInformatiiiCredit(creditNevoiPersonale);
		
		CreditLeasing creditLeasing=new CreditLeasing(2000, 10);
		//oferaInformatiiiCredit(creditLeasing);
		
		AdapterCredit adapter=new AdapterCredit(2500, 5);
		oferaInformatiiiCredit(adapter);

		AdapterCreditObiecte adapterObiecte=new AdapterCreditObiecte(creditLeasing);
		oferaInformatiiiCredit(adapterObiecte);
		
	}

}
