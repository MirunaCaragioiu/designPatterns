package credit.framework_achizitionat;

public class CreditLeasing {
	
	private float pretProdus;
	private int nrLuniRata;
	
	public CreditLeasing(float pretProdus, int nrLuniRata) {
		super();
		this.pretProdus = pretProdus;
		this.nrLuniRata = nrLuniRata;
	}
	
	public void achizitionareLeasing() {
		System.out.println("A fost achizitionat produsul cu pret: " +pretProdus);
	}
	
	public float calculRataLunala() {
		return this.pretProdus/this.nrLuniRata;
	}
}
