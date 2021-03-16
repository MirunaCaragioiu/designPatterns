package client;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Suma "+suma+" a fost platita cash");
		
	}

}
