package spital;

public class DoctorBoliGrele extends IDoctor {

	@Override
	public void consulta(Pacient pacient) {
		if(pacient.isBoalaGrava()) {
			System.out.println("Ne pare rau aveti o boala in stare terminala!");
		}
		
	}
	
}
