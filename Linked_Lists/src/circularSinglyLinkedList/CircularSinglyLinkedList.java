package circularSinglyLinkedList;

public class CircularSinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	public CircularSinglyLinkedList() {
		super();
	}
	
	public Node create(int value) {
		Node node = new Node();
		node.value = value;
		node.next = node;
		
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insert(int value, int location) {
		if(head == null) {
			create(value);
			return;
		}
		
		Node node = new Node();
		node.value = value;
		
		if(location <= 0) {
			node.next = head;
			head = node;
			tail.next = head;
		}
		else if(location >= size - 1) {
			node.next = head;
			tail.next = node;
			tail = node;
		}
		else {
			Node curr = head;
			int index = 0;
			while(index < location - 1) {
				curr = curr.next;
				index++;
			}
			
			node.next = curr.next;
			curr.next = node;
		}
		
		size++;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		
		Node i = head;
		while(head != null) {
			System.out.print(i.value);
			if(i == tail)break;
			System.out.print(" -> ");
			i = i.next;
		}
		System.out.println();
	}
	
	public boolean search(int key) {
		if(head == null) {
			System.out.println("Linked List is empty!!");
			return false;
		}
			Node iter = head;
			for(int i = 0; i < size; i++) {
				if(iter.value == key) {
					System.out.println("Found at "+ i + " location");
					return true;
				}
				iter = iter.next;
			}
		System.out.println("Not found!!");
		return false;
	}
	
	public void delete(int location) {
		if(head == null) {
			System.out.println("Linked list is empty!!");
			return;
		}
		
		if(location == 0) {
			head = head.next;
			tail.next = head;
		}
		else if(location >= size - 1) {
			Node iter = head;
			for(int i = 1; i < size -1; i++ ) {
				iter = iter.next;
			}
			
			iter.next = head;
			tail = iter;
		}
		else {
			Node iter = head;
			for(int i = 1; i < location; i++) {
				iter = iter.next;
			}
			iter.next = iter.next.next;
		}
		
		System.out.println("Deleted succesfully!");
		
		size--;
		if(size == 0) {
			head = null;
			tail = null;
		}
	}
	
	public void drop() {
		if(head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		else {
			head = null;
			tail = null;
		}
		System.out.println("Linked list deleted Sucsessfully!");
	}
}
