package queue_using_array;

public class Interface {
	public static void main(String[] args) {
		CircularQueueArray que = new CircularQueueArray(3);
		
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		
		que.dequeue();
		que.dequeue();
		
		que.enqueue(4);
		System.out.println(que.peek());
		que.dequeue();
		System.out.println(que.peek());
		System.out.println(que.curSize);
		que.dequeue();
		System.out.println(que.curSize);
		que.dequeue();
		que.enqueue(5);
		que.enqueue(6);
		
		System.out.println(que.start+" "+que.end);
		
		que.delete();
		que.dequeue();
		
	}
}
