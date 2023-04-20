package circularDoublyLinkedList;

public class CircularDoublyLinkedList {
	DoubleNode head;
	DoubleNode tail;
	int size;
	
	public DoubleNode create(int value) {
		DoubleNode newNode = new DoubleNode();
		newNode.value = value;
		head = newNode;
		tail = newNode;
		
		head.prev = tail;
		tail.next = head;
		
		size =1;
		return head;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		
		DoubleNode iter = head;
		int index = 0;
		while(true){
			System.out.print(iter.value);
			
			if(index >= size -1) break;
			
			System.out.print(" -> ");
			iter = iter.next;
			index++;
		}
		System.out.println();
	}
	
	public void reversPrint() {
		if(head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		
		DoubleNode iter = tail;
		int index = 0;
		while(true){
			System.out.print(iter.value);
			
			if(index >= size -1) break;
			
			System.out.print(" <- ");
			iter = iter.prev;
			index++;
		}
		System.out.println();
	}
	
	public void insert(int value, int location) {
		if(head == null) {
			create(value);
			return;
		}
		
		DoubleNode newNode = new DoubleNode();
		newNode.value = value;
		
		if(location <= 0) {
			newNode.next = head;
			newNode.prev = tail;
			head.prev = newNode;
			tail.next = newNode;
			
			head = newNode;
		}
		else if(location >= size) {
			newNode.next = head;
			newNode.prev = tail;
			tail.next = newNode;
			head.prev = newNode;
			
			tail = newNode;
		}
		else {
			DoubleNode iter = head;
			
			for(int i = 1; i < location; i++) {
				iter = iter.next;
			}
			
			newNode.next = iter.next;
			newNode.prev = iter;
			iter.next = newNode;
			newNode.next.prev = newNode;
		}
		
		size++;
	}
	
	public boolean search(int key) {
		if(head == null) {
			System.out.println("Linked list is empty");
			return false;
		}
		
		DoubleNode iter = head;
		for(int i = 0; i < size; i++) {
			if(iter.value == key) {
				System.out.println("Found at "+ i +" location.");
				return true;
			}
			iter = iter.next;
		}
		System.out.println("Not found!!");
		return false;
	}
	
	public void delete(int location) {
		if(head == null) {
			System.out.println("Linked List is empty!!");
			return;
		}
		
		if(location <= 0) {
			head = head.next;
			head.prev = tail;
			tail.next = head;
		}
		else if(location >= size-1) {
			tail = tail.prev;
			tail.next = head;
			head.prev = tail;
		}
		else {
			DoubleNode iter = head;
			for(int i = 0; i < location; i++) {
				iter = iter.next;
			}
			
			iter.prev.next = iter.next;
			iter.next.prev = iter.prev;
		}
		
		size--;
		if(size <= 0) {
			head = null;
			tail = null;
		}
	}
	
	public void drop() {
		DoubleNode iter = head;
		for(int i = 0; i < size; i++) {
			iter.prev = null;
		}
		
		head = null;
		tail = null;
		size = 0;
		System.out.println("Linked list is deleted sucessfully :)");
	}
}
