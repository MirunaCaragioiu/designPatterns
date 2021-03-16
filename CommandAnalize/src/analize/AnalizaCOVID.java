package analize;

public class AnalizaCOVID implements ISolicitareAnaliza{

	@Override
	public void analizaProba(TipAnaliza tip, String pacient) {
		System.out.println("A fost realizata analiza pentru COVID");
	}

}
