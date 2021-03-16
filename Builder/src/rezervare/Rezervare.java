package rezervare;

public class Rezervare {
	
	private boolean asezareGeam;
	private boolean scauneErgonomice;
	private boolean decorareaMesei;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public Rezervare() {
		this.asezareGeam = false;
		this.scauneErgonomice = false;
		this.decorareaMesei = false;
		this.muzicaAmbientalaPersonalizata = false;
		this.genMuzica = "clasica";
	}
	
	public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareaMesei,
			boolean muzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.asezareGeam = asezareGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareaMesei = decorareaMesei;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}

	public boolean isAsezareGeam() {
		return asezareGeam;
	}

	public void setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
	}

	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}

	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}

	public boolean isDecorareaMesei() {
		return decorareaMesei;
	}

	public void setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}

	public boolean isMuzicaAmbientalaPersonalizata() {
		return muzicaAmbientalaPersonalizata;
	}

	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [asezareGeam=" + asezareGeam + ", scauneErgonomice=" + scauneErgonomice + ", decorareaMesei="
				+ decorareaMesei + ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata + ", genMuzica="
				+ genMuzica + "]";
	}
		

}
