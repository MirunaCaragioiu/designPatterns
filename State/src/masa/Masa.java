package masa;

public class Masa {
	State stare;
	public int nrMasa;

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public Masa(int nrMasa) {
		super();
		this.stare = new StareLibera();
		this.nrMasa = nrMasa;
	}

	public void setStare(State stare) {
		this.stare = stare;
	}
	
	public void rezerva() {
		if(stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			stare.printStare(nrMasa);
		}
		else {
			System.out.println("Masa" + nrMasa +" nu poate fi rezervata");
		}
	}
	
	public void ocupa() {
		if(!(stare instanceof StareOcupata)) {
			this.stare=new StareOcupata();
			stare.printStare(nrMasa);
		}else {
			System.out.println("Masa" + nrMasa +" nu poate fi ocupata");
		}
	}

	public void elibereaza() {
		if(!(stare instanceof StareLibera)) {
			this.stare=new StareLibera();
			stare.printStare(nrMasa);
		}
		else {
			System.out.println("Masa" + nrMasa +" este deja libera");
		}
	}

}
