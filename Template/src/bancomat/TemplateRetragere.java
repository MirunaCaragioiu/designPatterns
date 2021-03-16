package bancomat;

public abstract class TemplateRetragere {

	protected String nrCard;
	protected int sumaSpecificata;
	
	public TemplateRetragere(String nrCard) {
		super();
		this.nrCard = nrCard;
	}
	
	public abstract void introducereCard();
	public abstract void introducerePin(String pin);
	public abstract void introducereSuma(int suma);
	public abstract int retragereSuma();
	public abstract void retragereCard();
	
	public final int retragereBani(String pin, int suma) {
		int sumaRetrasa;
		introducereCard();
		introducerePin(pin);
		introducereSuma(suma);
		sumaRetrasa = retragereSuma();
		retragereCard();
		
		return sumaRetrasa;
	}
	
}
