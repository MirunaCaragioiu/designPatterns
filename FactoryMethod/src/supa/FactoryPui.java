package supa;

public class FactoryPui implements FactorySupa{

	@Override
	public AbstractSupa creareSupa(double pret) {
		return new SupaPui(pret);
	}

}
