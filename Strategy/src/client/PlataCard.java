package client;

public class PlataCard implements ModPlata{

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Suma "+suma+" a fost platita cu cardul");		
	}

}
