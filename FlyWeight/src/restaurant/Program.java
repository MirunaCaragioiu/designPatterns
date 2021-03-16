package restaurant;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		Masa masa1=new Masa(1, 3, new Date());
		Masa masa2=new Masa(1, 2, new Date());
		
		IClient client=FabricaClienti.getClient("0730548548", "Caragioiu Miruna", "caragioiu.miruna1@gmail.com");
		client.descriere(masa1);
		
		IClient client1=FabricaClienti.getClient("0730548548", "Caragioiu Ioana", "caragioiu.miruna2@gmail.com");
		client1.descriere(masa2);
		
		IClient client3=FabricaClienti.getClient("0730548548", "Caragioiu Miruna-Ioana", "caragioiu.miruna3@gmail.com");
		client3.descriere(masa1);
		
		System.out.println(FabricaClienti.getSize());

	}

}
