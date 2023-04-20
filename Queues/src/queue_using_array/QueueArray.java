package queue_using_array;

public class QueueArray {
	int[] array;
	int start;
	int end;
	
	public QueueArray(int size) {
		this.array = new int[size];
		this.start = -1;
		this.end = -1;
		System.out.println("Queue created using array");
	}
	
	public QueueArray() {
		super();
	}
	
	public boolean isFull() {
		return end == array.length - 1;
	}
	
	public boolean isEmpty() {
		return (start == -1) || (start == array.length);
	}
	
	public void enqueue(int value) {
		if(isFull())System.out.println("Queue is full!!");
		else if(isEmpty()) {
			start = 0;
			array[start] = value;
			end = 0;
		}
		else {
			array[++end] = value;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return -1;
		}
		else {
			int temp = array[start++];
			if(start > end) {
				start = end = -1;
			}
			return temp;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return -1;
		}
		else return array[start];
	}
	
	public void delete() {
		array = null;
		System.out.println("Queue deleted");
	}
	
}
