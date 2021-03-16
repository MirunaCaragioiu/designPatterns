package spital;

public class Program {
	public static void main(String[] args) {
		IDoctor doctor1=new DoctorBoliUsoare();
		IDoctor doctor2=new DoctorBoliMedii();
		IDoctor doctor3=new DoctorBoliGrele();
		
		doctor1.setDoctorulUrmator(doctor2);
		doctor2.setDoctorulUrmator(doctor3);
		
		Pacient pacient1=new Pacient(true, false, false);
		Pacient pacient2=new Pacient(false,true,true);
		Pacient pacient3=new Pacient(false,false,true);
		
		doctor1.consulta(pacient1);
		doctor1.consulta(pacient2);
		doctor1.consulta(pacient3);
		
	}
}
