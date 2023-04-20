package doublyLinkedList;

public class Interface {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.create(4);
		dll.insert(3, 0);
		dll.insert(7, 7);
		dll.insert(5, 1);
		
		dll.print();
		dll.reversePrint();
		dll.search(33);
		
		dll.delete(2);
		dll.print();
		dll.reversePrint();
		dll.drop();
		dll.print();
	}
}
