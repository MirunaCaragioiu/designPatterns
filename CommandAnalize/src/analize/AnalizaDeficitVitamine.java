package analize;

public class AnalizaDeficitVitamine implements ISolicitareAnaliza{

	@Override
	public void analizaProba(TipAnaliza tip, String pacient) {
		System.out.println("A fost realizata analiza pentru deficit de vitamine");
	}

}
