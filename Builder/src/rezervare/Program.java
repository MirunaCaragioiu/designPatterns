package rezervare;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare=new Rezervare(false,true,false,false,"pop");
		System.out.println(rezervare.toString());
		
		Rezervare rezervare2=new Rezervare();
		rezervare2.setAsezareGeam(true);
		rezervare2.setGenMuzica("jazz");
		rezervare2.setScauneErgonomice(true);
		System.out.println(rezervare2.toString());
		
		
		BuilderRezervare builderRezervare=new BuilderRezervare();
		builderRezervare.setScauneErgonomice(true).setDecorareaMesei(true).setGenMuzica("clasica");
		Rezervare rezervare3=builderRezervare.build();
		System.out.println(rezervare3.toString());
		
		
		BuilderRezervare2 builder2=new BuilderRezervare2();
		builder2.setAsezareGeam(true).setMuzicaAmbientalaPersonalizata(true).setGenMuzica("rock");
		System.out.println(builder2.build().toString());
		
		BuilderRezervare2 builder3=new BuilderRezervare2().setMuzicaAmbientalaPersonalizata(true).setGenMuzica("rock");
		Rezervare rezervare4=builder3.build();
		Rezervare rezervare5=builder3.build();
		
	}

}
