package restaurant;

public class Program {

	public static void main(String[] args) {
		IOptiune cStartere=new Categorie("startere");
		IOptiune cBauturi=new Categorie("bauturi");
		IOptiune cDesert=new Categorie("desert");
		
		IOptiune cSucuri=new Categorie("sucuri");
		IOptiune cCafea=new Categorie("cafea");
		
		IOptiune itemApaPlata=new Item("ApaPlata");
		IOptiune itemApaMinerala=new Item("ApaMinerala");
		
		cStartere.adaugaOptiune(cBauturi);
		cStartere.adaugaOptiune(cDesert);
		cBauturi.adaugaOptiune(cSucuri);
		cBauturi.adaugaOptiune(itemApaMinerala);
		cBauturi.adaugaOptiune(itemApaPlata);
		cDesert.adaugaOptiune(cCafea);
		cStartere.descriere("");
		
	}

}
