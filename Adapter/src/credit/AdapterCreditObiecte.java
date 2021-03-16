package credit;

import credit.framework_achizitionat.CreditLeasing;
import credit.framework_existent.Credit;

public class AdapterCreditObiecte implements Credit {
	
	private CreditLeasing creditLeasing;
	
	public AdapterCreditObiecte(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		creditLeasing.achizitionareLeasing();
	}

	@Override
	public float rataLunara() {
		return creditLeasing.calculRataLunala();
	}
	
	

}
