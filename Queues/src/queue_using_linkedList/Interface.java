package queue_using_linkedList;

public class Interface {
	public static void main(String[] args) {
		QueueLinkedList que = new QueueLinkedList();
		
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		
		que.dequeue();
		que.dequeue();
		
		que.enqueue(4);
		System.out.println(que.peek());
		que.dequeue();
		System.out.println(que.peek());
		que.dequeue();
		que.dequeue();
		que.enqueue(5);
		que.enqueue(6);
		
		que.delete();
		que.dequeue();
		
	}
}
