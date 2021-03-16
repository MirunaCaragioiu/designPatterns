package spital;

public interface IOptiune {
	void stergereNod(IOptiune optiune);
	void adaugaNod(IOptiune opitune);
	IOptiune getChild(int index);
	void descriere(String identare);
}
