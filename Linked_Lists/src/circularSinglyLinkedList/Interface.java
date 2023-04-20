package circularSinglyLinkedList;

public class Interface {
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		
		cll.print();
		cll.search(5);
		cll.insert(1, 0);
		cll.insert(4, 5);
		cll.insert(5, 1);
		
		cll.print();
		
		cll.insert(7, 1);
		
		cll.print();
		
		cll.search(7);
		
		cll.delete(5);
		cll.print();
		cll.drop();
		cll.print();
	}
}
