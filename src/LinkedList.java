
public class LinkedList<T> {
	private Node<T> front;
	int size;
	
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
		for(Node<T> ptr = front; ptr != null; ptr = ptr.getNext()) {
			System.out.print(ptr.getData() + " -> ");
		}
		System.out.printf("\\ \n");
	}
	
	public T deleteFront() {
		T toReturn = front.getData();
		front = front.getNext();
		return toReturn;
	}
}
