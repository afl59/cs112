package Linear;

public class LInkedListDriver {

	public static void main(String[] args) {
		
		LinkedList<String> powerRangers = new LinkedList<String>();
		powerRangers.addToFront("Green Ranger");
		powerRangers.addToFront("Red Ranger");
		powerRangers.addToFront("Yellow Ranger");
		powerRangers.addToFront("Black Ranger");
		powerRangers.traverse();
		
		LinkedList<Double> math = new LinkedList<Double>();
		math.addToFront(3.14159);
		math.addToFront(2.144);
		math.addToFront(2.718);
		math.traverse();
	}

}
