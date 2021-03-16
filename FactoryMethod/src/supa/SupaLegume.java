package supa;

public class SupaLegume extends AbstractSupa{

	public SupaLegume(double pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comandaSupa() {
		System.out.println("A fost comandata supa de legume la pretul " + this.getPret());
		
	}

}
