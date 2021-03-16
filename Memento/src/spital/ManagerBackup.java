package spital;

import java.util.ArrayList;
import java.util.List;

public class ManagerBackup {
	
	List<Memento> list;

	public ManagerBackup() {
		this.list = new ArrayList<Memento>();
	}
	
	public void addBackup(Memento memento) {
		list.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie < list.size() && pozitie >= 0) {
			return list.get(pozitie);
		}else {
			return null;
		}
	}

}
