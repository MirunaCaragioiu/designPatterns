package supa;

public class SupaVita extends AbstractSupa{

	public SupaVita(double pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comandaSupa() {
		System.out.println("A fost comandata supa de vita la pretul " + this.getPret());
		
	}

}
