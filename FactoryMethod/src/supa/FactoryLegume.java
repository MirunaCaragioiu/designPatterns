package supa;

public class FactoryLegume implements FactorySupa{

	@Override
	public AbstractSupa creareSupa(double pret) {
		return new SupaLegume(pret);
	}

}
