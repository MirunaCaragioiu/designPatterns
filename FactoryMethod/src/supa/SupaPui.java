package supa;

public class SupaPui extends AbstractSupa{

	public SupaPui(double pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comandaSupa() {
		System.out.println("A fost comandata supa de pui la pretul " + this.getPret());
	}

}
