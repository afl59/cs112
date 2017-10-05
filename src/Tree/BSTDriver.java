package Tree;

public class BSTDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<Integer> tree = new BST<Integer>();
		tree.insert(10);
		tree.insert(7);
		tree.insert(15);
		tree.insert(5);
		tree.insert(13);
		tree.insert(20);
		System.out.println(tree.search(2));
		System.out.println(tree.search(5));
		tree.traverse(tree.root);
	}

}
