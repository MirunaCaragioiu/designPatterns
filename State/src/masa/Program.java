package masa;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(12);
		masa.elibereaza();
		masa.rezerva();
		masa.elibereaza();
		masa.ocupa();
		masa.elibereaza();
		
		
		
		StareOcupata ocupata=new StareOcupata();
		ocupata.schimbareStare(masa);

	}

}
