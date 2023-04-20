package Stack_Using_Array;

public class Stack {
	int[] arr;
	int top;
	
	public void create(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length - 1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full!!");
		}
		else {
			arr[++top] = value;
			System.out.println(value+" added");
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
		}
		else {
			int temp = arr[top--];
			System.out.println(temp+" deleted");
		}
	}
	
	public void delete() {
		arr = null;
		top = -1;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return -1;
		}
		return arr[top];
	}
}
