
public class DLLDriver {

	public static void main(String[] args) {
		DLL<String> shoes = new DLL<String>();
		shoes.addToFront("Vans");
		shoes.addToFront("Crocs");
		shoes.addToFront("Nike");
		shoes.addAfterTarget("Merrels", "Crocs");
		shoes.traverse();
		System.out.println();
		shoes.delete("Nike");
		shoes.traverse();
	}

}
