
public class StringLLDriver {

	public static void main(String[] args) {
		StringLinkedList shoppingList = new StringLinkedList();
		shoppingList.addToFront("Milk");
		shoppingList.addToFront("Cereal");
		shoppingList.addToFront("Bananas");
		shoppingList.addToFront("Apples");
		shoppingList.traverse();
		StringNode target = shoppingList.search("Cereal");
		if (target != null) {
			System.out.printf("Found target %s\n\n", target.getData());
		}
		
		StringLinkedList iceCream = new StringLinkedList();
		iceCream.addToFront("Chocolate");
		iceCream.addToFront("Rum Raisin");
		iceCream.addToFront("Mint Chocolate Chip");
		iceCream.traverse();
		
		
	}

}
