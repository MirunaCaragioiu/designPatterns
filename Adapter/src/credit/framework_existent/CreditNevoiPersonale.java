package credit.framework_existent;

public class CreditNevoiPersonale implements Credit{
	
	private float sumaCredit;
	private int nrLuni;
	
	

	public CreditNevoiPersonale(float sumaCredit, int nrLuni) {
		super();
		this.sumaCredit = sumaCredit;
		this.nrLuni = nrLuni;
	}

	@Override
	public void oferaCredit() {
		System.out.println("A fost oferit un credit cu suma: " + sumaCredit +", pentru " +nrLuni +" luni.");
		
		
	}

	@Override
	public float rataLunara() {
		return this.sumaCredit/this.nrLuni;
	}

}
