package queue_using_array;

public class CircularQueueArray {
	int[] array;
	int start;
	int end;
	int curSize;
	
	public CircularQueueArray(int size) {
		array = new int[size];
		start = -1;
		end = -1;
		curSize = 0;
	}
	
	public boolean isEmpty() {
		return curSize <= 0;
	}
	
	public boolean isFull() {
		return curSize >= array.length;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full!!");
			return;
		}
		if(start == -1) {
			start = 0;	
		}
		end = (end+1)%array.length;
		array[end] = value;
		curSize++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is emtpy!!");
			return -1;
		}
		int temp = array[start];
		start = (start+1)% array.length;
		curSize--;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is emtpy!!");
			return -1;
		}
		return array[start];
	}
	
	public void delete() {
		array = null;
		System.out.println("Queue deleted sucsessfully.");
	}
}
