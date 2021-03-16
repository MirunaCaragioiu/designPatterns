package reteta;

public class Facade {
	
	public static boolean verificaReteta(Reteta reteta) {
		if(Depozit.verificareDisponibilitate(reteta.getCodMedicament())) {
			if(CasaAsigurari.esteAsigurat(reteta.getNrCard())) {
				return true;
			}
		}
		return false;
	}
	
	
	public static String verificaRetetaMesaj(Reteta reteta) {
		if(Depozit.verificareDisponibilitate(reteta.getCodMedicament())) {
			if(CasaAsigurari.esteAsigurat(reteta.getNrCard())) {
				return ("Reteta poate fi procesata");
			}
			else return ("Client nu este asigurat");
		}
		else return("Nu exista disponibilitate");
	}


}
