package Tree;

public class BSTNode<T> {
	
	T key;
	BSTNode<T> left;
	BSTNode<T> right;
	
	public BSTNode(T key, BSTNode<T> left, BSTNode<T> right) {
		this.key = key; 
		this.left = left;
		this.right = right;
	}
}
