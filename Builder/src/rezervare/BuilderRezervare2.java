package rezervare;

public class BuilderRezervare2 implements IBuilder{
	
	private boolean asezareGeam;
	private boolean scauneErgonomice;
	private boolean decorareaMesei;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	

	public BuilderRezervare2 setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
		return this;
	}
	
	public BuilderRezervare2 setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
		return this;
	}
	
	public BuilderRezervare2 setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
		return this;
	}
	
	public BuilderRezervare2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		return this;
	}
	
	public BuilderRezervare2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare=new Rezervare(asezareGeam,scauneErgonomice,decorareaMesei,muzicaAmbientalaPersonalizata,genMuzica);
		return rezervare;
	}
	
	

}
