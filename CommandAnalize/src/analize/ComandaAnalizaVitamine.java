package analize;

public class ComandaAnalizaVitamine implements Laborator{
	
	ISolicitareAnaliza analiza;
	

	public ComandaAnalizaVitamine(ISolicitareAnaliza analiza) {
		super();
		this.analiza = analiza;
	}

	@Override
	public void executa() {
		analiza.analizaProba(TipAnaliza.DEFICIT_VITAMINE, "dan");
	}

}
