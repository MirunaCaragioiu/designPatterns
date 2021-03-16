package produs;

public class NegativePriceException extends IllegalArgumentException{
	
	public NegativePriceException(String mesaj) {
		super(mesaj);
	}

}
