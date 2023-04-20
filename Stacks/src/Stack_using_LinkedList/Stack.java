package Stack_using_LinkedList;

public class Stack {
	SinglyLinkedList list;
	
	public void create() {
		list = new SinglyLinkedList();
	}
	
	public void push(int value) {
		list.insertSLL(value, 0);
		System.out.println(value + " is added");
	}
	
	public boolean isEmpty() {
		return list.head == null;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!");
			return ;
		}
		int temp = list.head.value;
		list.deleteNode(0);
		System.out.println(temp+" is deleted");
	}
	
	public void delete() {
		list.drop();
		System.out.println("Stack is deleted");
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!");
			return -1;
		}
		return list.head.value;
	}
}