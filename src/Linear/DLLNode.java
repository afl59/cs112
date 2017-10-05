package Linear;

public class DLLNode<T> {
	private T data;
	private DLLNode<T> previous, next; // Link forwards and backwards
	
	public DLLNode(T data, DLLNode<T> previous, DLLNode<T> next) {
		this.data = data;
		this.previous = previous;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLLNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode<T> previous) {
		this.previous = previous;
	}

	public DLLNode<T> getNext() {
		return next;
	}

	public void setNext(DLLNode<T> next) {
		this.next = next;
	}
}
