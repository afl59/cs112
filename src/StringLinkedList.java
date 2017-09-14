
public class StringLinkedList {
	private StringNode front; // Handle to linked list
	private int size;
	
	public StringLinkedList() {
		front = null;
		size = 0;
	}
	
	public void addToFront(String data) {
		front = new StringNode(data, front);
		size++;
	}
	
	public void deleteFront() {
		front = front.getNext(); // front.next is second node in LL
		size--;
	}
	
	// Prints size of LL and all elements within it
	public void traverse() {
		System.out.printf("The linked list has %d nodes\n", size);
		for(StringNode ptr = front; ptr != null; ptr = ptr.getNext()) {
			System.out.printf(" %s -> ", ptr.getData());
		}
		System.out.printf("\\ \n");
	}
	
	// Searches Linked List for target String
	public StringNode search(String target) {
		for(StringNode ptr = front; ptr != null; ptr = ptr.getNext()) {
			if(ptr.getData().equals(target)) {
				return ptr;
			} 
		}
		return null;
	}
	
	// Adds a StringNode after node with target data
	public StringNode addAfter(StringNode front, String target, String data) { 
		StringNode ptr = front;
		while(ptr != null && !(ptr.getData().equals(target))) { // Find element by target (data)
			ptr = ptr.getNext();
		}
		if(ptr != null) {
			// Target data found, ptr points to it
			StringNode node = new StringNode(data, ptr.getNext());
			ptr.setNext(node);
		} else {
			System.out.println("Target not found.");
			return front;
		}
		return front;
	}
	
	public StringNode deleteNode(StringNode front, String target) {
		StringNode ptr = front;
		while(ptr != null && !(ptr.getNext().getData().equals(target))) { // Looks at the next node's data for target
			ptr = ptr.getNext(); // Move to next node
		}
		if(ptr != null) { // Selected target node
			ptr.setNext(ptr.getNext().getNext()); // Excludes "next" node from LL
		} else {
			System.out.println("Target not found.");
			return front;
		}
		return front;
	}
}
