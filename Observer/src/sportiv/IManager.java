package sportiv;

public interface IManager {
	void adaugaClient(IClient client);
	void stergeClient(IClient client);
	void notifica(String mesaj);
}
