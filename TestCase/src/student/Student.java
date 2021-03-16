package student;

import student.ExceptieNumarRestante;

class Student {
	// numele trebuie sa aiba o lungime de cel putin 3 caractere
	private String numeStudent;
	// cod matricol trebuie sa aba lungimea de 6 caractere.
	// Primle doua caractere sunt literere Specializarii iar urmatoarele 4
	// reprezinta numarul
	// studentului
	// exemplu: IN1323
	private String codMatricol;
	// media poate avea valori cuprinse intre 1 si 10.
	// este calculata pe baza notelor obtinute la examene
	private float medie;

	public Student() {
		super();
		this.numeStudent = "Gigel";
		this.codMatricol = "ST1234";
		this.medie = 10;
	}

	public Student(String numeStudent, String codMatricol, float medie) {
		super();
		this.numeStudent = numeStudent;
		this.codMatricol = codMatricol;
		this.medie = medie;
	}

	public float getMedie(){
		return this.medie;
	}

	public double calculeazaMediaStudentului(int[] noteObtinuteLaExamene) {
		int suma = 0;
		for (int nota : noteObtinuteLaExamene)
			suma += nota;
		return this.medie = suma / noteObtinuteLaExamene.length;
	}

	public String determinareTipStudent(float medie) {
		if (medie < 5) {
			return "Restantier";
		}
		if (medie >= 5 && medie < 8) {
			return "Integralist";
		}
		if (medie >= 8 && medie < 9.9) {
			return "Bursier";
		}
		if (medie >= 9.9 && medie <=10) {
			return "Sef de promotie";
		}
		return "Fara Tip";

	}

	public int getNumarRestante(int[] noteObtinuteLaExamene) {
		int nrRestante = 0;
		for (int nota : noteObtinuteLaExamene)
			if(nota>10) {
				throw new ExceptieNumarRestante("Nota maxima este 10");
			}
			else if (nota < 5) {
				nrRestante += 1;
			}
		return nrRestante;
	}

}