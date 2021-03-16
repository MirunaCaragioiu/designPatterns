package analize;

public class AnalizaColesterol implements ISolicitareAnaliza{

	@Override
	public void analizaProba(TipAnaliza tip, String pacient) {
		System.out.println("A fost realizata analiza pentru colesterol");
	}

}
