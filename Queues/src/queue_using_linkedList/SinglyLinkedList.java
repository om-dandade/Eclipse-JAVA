package queue_using_linkedList;

public class SinglyLinkedList {
	Node head = null;
	Node tail = null;
	int size;
	SinglyLinkedList(int value){
		createSLL(value);
	}
	SinglyLinkedList(){
		super();
	}
	
	public Node createSLL(int value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	public void insertSLL(int value, int location){
		// if LL is empty
		if(head == null) {
			createSLL(value);
			return;
		}
		//boiler plate node with value
		Node node = new Node();
		node.value = value;
		
		//if location is 0 i.e. at head
		if(location == 0) {
			node.next = head;
			head = node;
		}
		//if location is size or greater than size i.e. at tail
		else if(location >=size) {
			node.next = null;
			tail.next = node;
			tail = node;
		}
		//if location is in between i.e. mid
		else {
			int index = 0;
			Node currNode = head;
			while(index < location-1) {
				currNode = currNode.next;
				index++;
			}
			
			Node temp = currNode.next;
			currNode.next = node;
			node.next = temp;
		}
		size++;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		Node temp = head;
		while(head != null) {
			System.out.print(temp.value);
			if(temp == tail)break;
			System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public boolean searchNode(int value) {
		Node temp = head;
		if(head != null) {
			for(int i = 0; i < size; i++) {
				if(temp.value == value) {
					System.out.println("Node found at index location " + i);
					return true;
				}
				temp = temp.next;
			}
		}
		System.out.println("Not found!");
		return false;
	}
	
	public void deleteNode(int location) {
		if(head == null)System.out.println("Linked List is Empty!");
		
		//if to delete head
		else if(location == 0) {
			head = head.next;
			size--;
		}
		else if(location >= size -1) {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			size--;
		}
		else {
			Node temp = head;
			for(int i = 1; i < location; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
		if(size == 0)tail = null;
	}
	
	public void drop() {
		head = null;
		tail = null;
		System.out.println("Linked List deleted sucsessfully!");
	}
}
