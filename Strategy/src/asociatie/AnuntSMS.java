package asociatie;

public class AnuntSMS implements ModPublicareAnunt{

	@Override
	public void modPublicareAnunt() {
		System.out.println("Anuntul va fi trimis prin sms.");
	}

}
