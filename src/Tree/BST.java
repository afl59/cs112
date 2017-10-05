package Tree;

/*
 * Binary Search Tree (BST)
 * Duplicates not allowed
 * Comparable requires its objects to implement compare to
 */
public class BST<T extends Comparable<T>> {

	BSTNode<T> root;
	int size;

	BST() {
		root = null;
		size = 0;
	}

	public void insert(T key) {
		// 1. Search until failure
		BSTNode<T> ptr = root;
		BSTNode<T> prev = null;

		int c = 0;
		while (ptr != null) {
			c = key.compareTo(ptr.key);
			if (c == 0) { // Key and ptr.key are equal
				throw new IllegalArgumentException(key + " already in BST");
			}
			prev = ptr;
			if (c < 0) { // key is smaller than ptr.key
				ptr = ptr.left;
			} else { // key is greater than ptr.key
				ptr = ptr.right;
			}
		}

		// 2. Insert at failure point
		BSTNode<T> node = new BSTNode<T>(key, null, null); // Node is a leaf
		if (prev == null && ptr == null) { // Empty tree
			root = node;
		} else if (c < 0) {// New Node is less than prev
			prev.left = node;
		} else {
			prev.right = node;
		}
	}
	
	public BSTNode<T> search (T key) {
		BSTNode<T> ptr = root;
		int c = 0;
		while(ptr != null) {
			c = key.compareTo(ptr.key);
			if(c == 0) // found target
				return ptr;
			else if (c < 0)
				ptr = ptr.left;
			else
				ptr = ptr.right;
		}
		return null;
	}
	
	// In order, prints out tree
	public static <T extends Comparable<T>> void traverse(BSTNode<T> root) {
		if(root == null)
			return;
		traverse(root.left);
		System.out.println(root.key);
		traverse(root.right);
	}
	
	
}
