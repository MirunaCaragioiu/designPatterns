package managerLaborator;

public class Program {

	public static void main(String[] args) {
		ManagerLaborator manager = ManagerLaborator.getInstanta("Andrei", 50);
		ManagerLaborator manager1 = ManagerLaborator.getInstanta("Marcus", 70);
		ManagerLaborator manager2 = ManagerLaborator.getInstanta("Marcus", 100);
		System.out.println(manager.toString());
		System.out.println(manager1.toString());
		System.out.println(manager2.toString());
	}

}
