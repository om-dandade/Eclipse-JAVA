package circularDoublyLinkedList;

public interface Interface {
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		
		cdll.create(8);
		cdll.insert(3, 0);
		cdll.insert(9, 0);
		cdll.insert(5, 0);
		cdll.print();
		cdll.insert(2, 4);
		
		cdll.print();
		cdll.search(0);
		
		cdll.delete(3);
		cdll.print();
		cdll.reversPrint();
		cdll.drop();
		cdll.print();
	}
}
