package asociatie;

public class AsociatieLocatari {
	
	private int nrBloc;
	private ModPublicareAnunt modPublicareAnunt;
	
	public AsociatieLocatari(int nrBloc) {
		super();
		this.nrBloc = nrBloc;
	}

	public void setModPublicareAnunt(ModPublicareAnunt modPublicareAnunt) {
		this.modPublicareAnunt = modPublicareAnunt;
	}
	
	public void alegeModPublicareAnunt() {
		this.modPublicareAnunt.modPublicareAnunt();
	}

}
