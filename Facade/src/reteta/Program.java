package reteta;

import java.awt.CardLayout;

public class Program {

	public static void main(String[] args) {
		
		Reteta reteta=new Reteta(34,57);
		if(Depozit.verificareDisponibilitate(reteta.getCodMedicament())) {
			if(CasaAsigurari.esteAsigurat(reteta.getNrCard())) {
				System.out.println("Reteta poate fi procesata");
			}
			else System.out.println("Client nu este asigurat");
		}
		else System.out.println("Nu exista disponibilitate");
		
		if(Facade.verificaReteta(reteta)) {
			System.out.println("Reteta poate fi procesata");
		}
		else System.out.println("Reteta nu poate fi procesata");
		
		
		Reteta reteta2=new Reteta(37,159);
		System.out.println(Facade.verificaRetetaMesaj(reteta2));
		
	}

}
