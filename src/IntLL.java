
public class IntLL {
	
	public static void main(String[] args) {
		IntNode L = null;
		L = addToFront(5, L);
		L = addToFront(4, L);
		L = addToFront(3, L);
		traverse(L);
		System.out.println();
		
		L = deleteFront(L); // L updates so that first element is excluded
		traverse(L);
		System.out.println();
		
		L = addToFront(2, L);
		traverse(L);
		System.out.println();
		
		addAfter(L, 5, 6);
		addAfter(L, 2, 3);
		traverse(L);
		System.out.println();
		
		deleteNode(L, 4);
		traverse(L);
		System.out.println();
	}
	
	public static IntNode addToFront(int data, IntNode front) {
		IntNode node = new IntNode(data, front);
		return node;
	}
	
	// Removes the front element from the LL
	public static IntNode deleteFront(IntNode front) {
		return front.getNext(); // front.next is second node in LL
	}
	
	// Traverses the LL printing all elements within it
	public static void traverse(IntNode front) {
		IntNode ptr = front;
		while(ptr != null) {
			System.out.print(ptr.getData() + " -> ");
			ptr = ptr.getNext();
		}
	}
	
	// Adds an IntNode object after target data
	public static void addAfter(IntNode front, int target, int data) { 
		IntNode ptr = front;
		while(ptr != null && ptr.getData() != target) { // Find element by target (data)
			ptr = ptr.getNext();
		}
		if(ptr != null) {
			// Target data found, ptr points to it
			IntNode node = new IntNode(data, ptr.getNext());
			ptr.setNext(node);
		} else {
			System.out.println("Target not found.");
		}
	}
	
	// Deletes node with target data
	public static void deleteNode(IntNode front, int target) {
		IntNode ptr = front;
		while(ptr != null && ptr.getNext().getData() != target) { // Looks at the next node's data for target
			ptr = ptr.getNext(); // Move to next node
		}
		if(ptr != null) { // Selected target node
			ptr.setNext(ptr.getNext().getNext()); // Excludes "next" node from LL
		}
	}
	
	
}
