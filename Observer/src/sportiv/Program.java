package sportiv;

public class Program {

	public static void main(String[] args) {
		IClient client1=new Client("Caragioiu Miruna");
		IClient client2=new Client("Caragioiu Miruna1");
		IClient client3=new Client("Caragioiu Miruna2");
		
		Manager manager=new Manager("EU");
		manager.adaugaClient(client1);
		manager.adaugaClient(client2);
		manager.adaugaClient(client3);
		
		manager.meciNou("fotbal");
		
	}

}
