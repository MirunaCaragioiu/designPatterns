package farmacie;

public interface IOptiune {
	void stergereNod(IOptiune optiune);
	void adaugaNod(IOptiune optiune);
	IOptiune getChild(int index);
	void descriereNod(String identare);
	
}
