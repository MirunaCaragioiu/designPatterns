package credit;

import credit.framework_achizitionat.CreditLeasing;
import credit.framework_existent.Credit;

public class AdapterCredit extends CreditLeasing implements Credit{

	public AdapterCredit(float pretProdus, int nrLuniRata) {
		super(pretProdus, nrLuniRata);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.achizitionareLeasing();
		
	}

	@Override
	public float rataLunara() {
		return super.calculRataLunala();
	}
	
	

}
