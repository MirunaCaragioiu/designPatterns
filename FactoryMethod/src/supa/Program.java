package supa;

public class Program {

	public static void main(String[] args) {
		
		FactorySupa factorySupa=new FactoryLegume();
		AbstractSupa supa = factorySupa.creareSupa(10.40);
		supa.comandaSupa();
		
		AbstractSupa supa2 = new FactoryPui().creareSupa(15.40);
		supa2.comandaSupa();

	}

}
