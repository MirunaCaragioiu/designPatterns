package produs;

import java.util.ArrayList;

import produs.MaxException;
import produs.NegativePriceException;

public class Produs {
	String denumire;	//minim 3 caractere, maxim 30
	int stoc;		//valori intre [1, 1000]
	float pret;		//valori pozitive
	ArrayList<Integer> vanzariZilnice;
	
	public Produs(String denumire, int stoc, float pret) {
		this.denumire = denumire;
		this.stoc = stoc;
		this.pret = pret;
		vanzariZilnice=new ArrayList<Integer>();
	}

	public float getPret() {
		return pret;
	}
	
	public String getDenumire() {
		return this.denumire;
	}

	
	public int getStoc() {
		return stoc;
	}

	public void setPret(float pret) {
		if(pret>=0)
		{this.pret = pret;
		}
		else {
			throw new NegativePriceException("Pretul trebuie sa fie pozitiv!");
		}
	}

	public void setVanzariZilnice(ArrayList<Integer> vanzariZilnice) {
		this.vanzariZilnice = vanzariZilnice;
	}


	//determina numarul maxim de produse vandute
	public int getVanzareMaxima() {
		if(vanzariZilnice.size()>0)
		{int maxim  = 0;
		for(int valoare : vanzariZilnice)
			if(valoare < maxim)
				valoare = maxim;
		return maxim;
		}
		else {
			throw new MaxException("Nu sunt vanzari zilnice!");
		}
	}
	
	//actualizeaza stocul prin comanda furnizor - la stocul existent se adauga cantitatea comandata
	//daca furnizorul nu are produse pe stoc atunci se arunca exceptie de tip UnsupportedOperationException
	
	public void comandaFurnizor(int cantitate, IFurnizor furnizor) {
		if(furnizor.verificaStocFurnizor(cantitate))
			this.stoc = this.getStoc() + cantitate;
		else
			throw new UnsupportedOperationException();
			
	}
}
