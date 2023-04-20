package donno;

public class Interface {
	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode cola = new TreeNode("Cola");
		TreeNode sprite = new TreeNode("Sprite");
		
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(sprite);
		cold.addChild(cola);
		
		System.out.println(drinks.print(0));
	}
}
