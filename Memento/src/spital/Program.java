package spital;

public class Program {

	public static void main(String[] args) {
		
		Spital spital =new Spital("judetean", 200, 256);
		ManagerBackup manager=new ManagerBackup();
		
		manager.addBackup(spital.saveMemento());
		spital.setNrMedici(40);
		System.out.println(spital.toString());
		
		spital.setNrMedici(26);
		System.out.println(spital.toString());
		
		manager.addBackup(spital.saveMemento());
		spital.restoreFromMemento(manager.getMemento(0));
		System.out.println(spital.toString());
	}

}
