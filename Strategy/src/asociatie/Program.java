package asociatie;

public class Program {

	public static void main(String[] args) {
		AsociatieLocatari asociatie=new AsociatieLocatari(45);
		asociatie.setModPublicareAnunt(new AnuntSMS());
		asociatie.alegeModPublicareAnunt();
		
		asociatie.setModPublicareAnunt(new AnuntPrintat());
		asociatie.alegeModPublicareAnunt();
		
		AsociatieLocatari asociatie2=new AsociatieLocatari(14);
		asociatie2.setModPublicareAnunt(new AnuntEmail());
		asociatie2.alegeModPublicareAnunt();

	}

}
