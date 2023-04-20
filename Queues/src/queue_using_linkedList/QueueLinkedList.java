package queue_using_linkedList;

public class QueueLinkedList {
	SinglyLinkedList list;
	
	public QueueLinkedList() {
		list = new SinglyLinkedList();
	}
	
	public boolean isEmpty() {
		return list.head == null;
	}
	
	public void enqueue(int value) {
		list.insertSLL(value, list.size);
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int temp = list.head.value;
		list.deleteNode(0);
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return -1;
		}
		return list.head.value;
	}
	
	public void delete() {
		list.drop();
	}
}
