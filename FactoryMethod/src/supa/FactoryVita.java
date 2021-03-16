package supa;

public class FactoryVita implements FactorySupa{

	@Override
	public AbstractSupa creareSupa(double pret) {
		return new SupaVita(pret);
	}

}
