package spital;

public abstract class IDoctor {
	private IDoctor doctorulUrmator;

	public IDoctor getDoctorulUrmator() {
		return doctorulUrmator;
	}

	public void setDoctorulUrmator(IDoctor doctorulUrmator) {
		this.doctorulUrmator = doctorulUrmator;
	}
	public abstract void consulta(Pacient pacient);
	
}
