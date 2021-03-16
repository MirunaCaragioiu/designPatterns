package client;

public class Program {

	public static void main(String[] args) {
		IClient client=new Client("client",10);
		IClient client2=client.clonare();
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
	}

}
