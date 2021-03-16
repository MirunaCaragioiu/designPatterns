package analize;

public class ComandaAnalizaCOVID implements Laborator {
	
	ISolicitareAnaliza analiza;
	
	

	public ComandaAnalizaCOVID(ISolicitareAnaliza analiza) {
		super();
		this.analiza = analiza;
	}

	@Override
	public void executa() {
		analiza.analizaProba(TipAnaliza.COVID, "dan");
	}

}
