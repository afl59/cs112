package Linear;

public class StringNode {
	private String data;
	private StringNode next;
	
	public StringNode(String data, StringNode next) {
		this.data = data;
		this.next = next;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public StringNode getNext() {
		return next;
	}
	public void setNext(StringNode next) {
		this.next = next;
	}
	
	
}
