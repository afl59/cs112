package Linear;

public class CLL<T> {
	private Node<T> tail;
	private int size;

	public CLL() {
		tail = null;
		size = 0;
	}

	public void addToFront(T data) {
		Node<T> node = new Node<T>(data, null);
		if (tail == null) { // Indicates empty CLL
			node.setNext(node);
			tail = node;
		} else {
			node.setNext(tail.getNext());
			tail.setNext(node);
		}
		size++;
	}

	public Node<T> search(T target) {
		Node<T> ptr = tail.getNext();
		do {
			if (ptr.getData().equals(target)) {
				return ptr;
			} else {
				ptr = ptr.getNext();
			}
		} while (ptr != tail);
		return tail;
	}

	public void deleteFront() {
		if (tail == null || tail == tail.getNext()) {
			// CLL has one element
			tail = null;
			size = 0;
		} else {
			// tail should point to second element
			tail.setNext(tail.getNext().getNext());
			size--;
		}
	}

	public boolean delete(T target) {
		Node<T> ptr = tail.getNext();
		do {
			if (ptr.getNext().getData().equals(target)) {
				ptr.setNext(ptr.getNext().getNext());
				return true;
			} else {
				ptr = ptr.getNext();
			}
		} while (ptr != tail);
		return false;
	}
	
	public boolean addAfter(T data, T target) {
		Node<T> ptr = tail.getNext();
		do {
			if (ptr.getData().equals(target)) {
				ptr.setNext(new Node(data, ptr.getNext()));
				return true;
			} else {
				ptr = ptr.getNext();
			} 
		}while (ptr != tail);
		return false;
	}
}
