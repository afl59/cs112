
public class IntLL {
	
	public static void main(String[] args) {
		IntNode L = null;
		L = addToFront(21, L);
		L = addToFront(15, L);
		L = addToFront(12, L);
		L = addToFront(9, L);
		L = addToFront(3, L);
		traverse(L);
		System.out.println();
		
		deleteEveryOther(L);
	
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
	
	public static IntNode addBefore(IntNode front, int target, int newItem) {
		IntNode ptr = front;
		while(ptr != null && ptr.getNext().getData() != target) {
			ptr = ptr.getNext();
		}
		if(ptr != null) {
			// Target data found, ptr points to item before it.
			ptr.setNext(new IntNode(target, ptr.getNext()));
			return front;
		} else {
			return front;
		}
	}
	
	public static IntNode addBeforeLast(IntNode front, int item) {
		IntNode ptr = front;
		if(front.getNext() == null) {
			return null;
		}
		while(ptr != null && ptr.getNext().getNext() != null) {
			ptr = ptr.getNext();
		}
		if(ptr.getNext().getNext() == null) {
			ptr.setNext(new IntNode(item, ptr.getNext()));
			return front;
		}
		else {
			return front;
		}
	}
	
	public static void deleteEveryOther(IntNode front) {
		for(IntNode ptr = front; ptr.getNext() != null && ptr.getNext().getNext() != null; ptr = ptr.getNext()) {
			ptr.setNext(ptr.getNext().getNext());
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
	
	public static IntNode commonElements(IntNode frontL1, IntNode frontL2) {
		IntNode newFront = null;
		IntNode markEnd = newFront;
		for(IntNode ptrA = frontL1; ptrA != null; ptrA = ptrA.getNext()) {
			for(IntNode ptrB = frontL2; ptrB != null; ptrB = ptrB.getNext()) {
				if(ptrA.getData() == ptrB.getData()) {
					markEnd.setNext(new IntNode(ptrA.getData(), markEnd));
					markEnd = markEnd.getNext();
				}
			}
		}
		return null;
	}
}
