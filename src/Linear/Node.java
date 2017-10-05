package Linear;
/*
 * Generic class
 * <T> placeholder for the type we wish to instantiate this class
 */
public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
