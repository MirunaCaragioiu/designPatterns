package asociatie;

public class AnuntEmail implements ModPublicareAnunt {

	@Override
	public void modPublicareAnunt() {
		System.out.println("Anuntul va fi trimis prin email.");
	}

}
