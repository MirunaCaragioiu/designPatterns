package rezervare;

public class BuilderRezervare implements IBuilder{
	
	private Rezervare rezervare;

	public BuilderRezervare() {
		super();
		this.rezervare = new Rezervare();
	}

	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	
	public BuilderRezervare setAsezareGeam(boolean asezareGeam) {
		this.rezervare.setAsezareGeam(asezareGeam);
		return this;
	}
	

	public BuilderRezervare setScauneErgonomice(boolean scauneErgonomice) {
		this.rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}
	
	public BuilderRezervare setDecorareaMesei(boolean decorareaMesei) {
		this.rezervare.setDecorareaMesei(decorareaMesei);
		return this;
	}
	
	
	public BuilderRezervare setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
		return this;
	}
	
	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
