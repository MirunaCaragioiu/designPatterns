package analize;

public class Program {

	public static void main(String[] args) {
		ISolicitareAnaliza solicitaAnaliza=new AnalizaCOVID();
		ISolicitareAnaliza solicitaAnaliza2=new AnalizaColesterol();
		ISolicitareAnaliza solicitaAnaliza3=new AnalizaCOVID();
		ISolicitareAnaliza solicitaAnaliza4=new AnalizaDeficitVitamine();
		ISolicitareAnaliza solicitaAnaliza5=new AnalizaCOVID();
		
		Operator operator=new Operator();
		
		Laborator laborator=new ComandaAnalizaColesterol(solicitaAnaliza);
		Laborator laborator2=new ComandaAnalizaCOVID(solicitaAnaliza2);
		Laborator laborator3=new ComandaAnalizaCOVID(solicitaAnaliza3);
		Laborator laborator4=new ComandaAnalizaCOVID(solicitaAnaliza4);
		Laborator laborator5=new ComandaAnalizaCOVID(solicitaAnaliza5);

		operator.invoca(laborator);
		operator.invoca(laborator2);
		operator.invoca(laborator3);
		operator.invoca(laborator4);
		operator.invoca(laborator5);

	}

}
