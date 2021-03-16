package spital;

public class DoctorBoliUsoare extends IDoctor{

	@Override
	public void consulta(Pacient pacient) {
		if(pacient.isBoalaUsoara()) {
			System.out.println("Pacientul a fost trata de boala usoara!");
		}else {
			super.getDoctorulUrmator().consulta(pacient);
		}
		
	}
	
}
