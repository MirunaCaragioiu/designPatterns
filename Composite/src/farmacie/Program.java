package farmacie;

public class Program {
	public static void main(String[] args) {
		//categorii
		
		IOptiune antibiotice = new CategorieComposite("Antibiotice");
		IOptiune adulti = new CategorieComposite("Adulti");
		IOptiune copii = new CategorieComposite("Copii");
		
		//frunze
		
		IOptiune mMedicament = new NodFrunzaMedicament("Augumentin");
		IOptiune mMedicament2 = new NodFrunzaMedicament("Augumentin2");
		
		antibiotice.adaugaNod(adulti);
		antibiotice.adaugaNod(copii);
		adulti.adaugaNod(mMedicament);
		copii.adaugaNod(mMedicament2);
		
		antibiotice.descriereNod("");
		
		antibiotice.getChild(0).adaugaNod(antibiotice.getChild(1).getChild(0));
		antibiotice.getChild(1).stergereNod(antibiotice.getChild(1).getChild(0));
		
		
		System.out.println("\n");
		
		antibiotice.descriereNod("");
		
		
		
		
	}

}
