package analize;

public class ComandaAnalizaColesterol implements Laborator{
	
    ISolicitareAnaliza analiza;
	

	public ComandaAnalizaColesterol(ISolicitareAnaliza analiza) {
		super();
		this.analiza = analiza;
	}

	@Override
	public void executa() {
		analiza.analizaProba(TipAnaliza.COLESTEROL, "dan");
	}

}
