package restaurant;

public interface IOptiune {
	void adaugaOptiune(IOptiune optiune);
	void stergeOptiune(IOptiune optiune);
	void descriere(String identare);
	IOptiune getOptiune(int index);
}
