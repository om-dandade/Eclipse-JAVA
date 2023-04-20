package singlyLinkedList;

public class Experience {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList(4);
		sll.insertSLL(6, 0);
		sll.insertSLL(8, 1);
		sll.insertSLL(10, 2);
		sll.print();
		
		sll.drop();
		sll.print();
		sll.searchNode(10);
	}
}
