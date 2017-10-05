package Linear;

public class DLL<T> {
	
	DLLNode front;
	int size;
	
	public DLL() {
		front = null;
		size = 0;
	}
	
	public void addToFront(T data) {
		DLLNode<T> node = new DLLNode(data, null, front);
		if(front != null) 
			front.setPrevious(node);
		front = node;
	}
	
	public DLLNode moveToFront(T target) {
		DLLNode ptr = front;
		DLLNode targetNode;
		do {
			if (ptr.getNext().getData().equals(target)) { // Selected DLLNode BEFORE target DLLNode
				targetNode = ptr.getNext();
				ptr.setNext(ptr.getNext().getNext());
			}
		} while (true); // DONE FOR COMPILE
	}
	
	public void addAfterTarget(T data, T target) {
		DLLNode ptr = front;
		while(ptr != null && !ptr.getData().equals(target)) {
			ptr = ptr.getNext();
		}
		if(ptr == null) {
			System.out.println("Target not found.");
			return;
		} else {
			DLLNode node = new DLLNode(data, ptr, ptr.getNext());
			if(ptr.getNext() != null)
				ptr.getNext().setPrevious(node);
			ptr.setNext(node);
			size++;
		}
	}
	
	public T delete(T target) {
		DLLNode ptr = front;
		while(ptr != null && !ptr.getData().equals(target)) {
			ptr = ptr.getNext();
		}
		if(ptr != null) {
			T tmp = (T) ptr.getData();
			if(ptr.getPrevious() == null && ptr.getNext() == null) {
				front = null;
				size--;
				return tmp;
			}
			if(ptr == front) {
				ptr.getNext().setPrevious(null);
				front = ptr.getNext();
			}
			if(ptr.getPrevious() != null) {
				ptr.getPrevious().setNext(ptr.getNext());
			}
			if(ptr.getNext() != null) {
				ptr.getNext().setPrevious(ptr.getPrevious());
			}
			size--;
			return tmp;
		}
		return null;
	}
	
	public void traverse() {
		System.out.printf("Printing DLL with %d nodes. \n", size);
		for(DLLNode ptr = front; ptr != null; ptr = ptr.getNext()) {
			System.out.print(ptr.getData() + " -> ");
		}
		System.out.print("\\");
	}
	
	
}
