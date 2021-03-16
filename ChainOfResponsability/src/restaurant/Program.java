package restaurant;

public class Program {

	public static void main(String[] args) {
		
		Angajat barman=new Barman();
		Angajat ospatar=new Ospatar();
		Angajat debarasator=new Debarasator();
		
		barman.setUrmatorulAngajat(ospatar);
		ospatar.setUrmatorulAngajat(debarasator);
		
		Client c=new Client(true, false, false);
		Client c2=new Client(false,true,false);
		Client c3=new Client(false,false,true);
		
		barman.serveste(c);
		barman.serveste(c2);
		barman.serveste(c3);
	}

}
