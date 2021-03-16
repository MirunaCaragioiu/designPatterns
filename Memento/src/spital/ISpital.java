package spital;

public interface ISpital {
	
	public Memento saveMemento();
	public void restoreFromMemento(Memento memento);

}
