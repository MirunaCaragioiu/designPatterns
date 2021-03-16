package spital;

public class DoctorBoliMedii extends IDoctor {

	@Override
	public void consulta(Pacient pacient) {
		if(pacient.isBoalaMijlocie()) {
			System.out.println("Pacientul a fost trata de boala mijlocie!");
		}else {
			super.getDoctorulUrmator().consulta(pacient);
		}
		
	}

}
