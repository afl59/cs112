package Linear;
import java.util.NoSuchElementException;

public class LinkedList<T> {
	private Node<T> front;
	private int size;

	public LinkedList() {
		front = null;
		size = 0;
	}

	public void addToFront(T data) {
		front = new Node<T>(data, front);
		size++;
	}

	public void traverse() {
		System.out.printf("LinkedList has a size of %d \n", size);
		for (Node<T> ptr = front; ptr != null; ptr = ptr.getNext()) {
			System.out.print(ptr.getData() + " -> ");
		}
		System.out.printf("\\ \n");
	}

	public T deleteFront() {

		if (front == null) {
			throw new NoSuchElementException("List is empty");
		}
		T toReturn = front.getData();
		front = front.getNext();
		return toReturn;
	}

	public Node rDelete(Node front, T target) {
		if (front == null)
			return null;
		if (front.getData().equals(target))
			return rDelete(front.getNext(), target);
		front.setData(rDelete(front.getNext(), target));
		return front;
	}
	
}
