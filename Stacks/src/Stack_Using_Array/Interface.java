package Stack_Using_Array;

public class Interface {
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.create(5);
		System.out.println(st.peek());
		st.pop();
		st.push(4);
		st.push(6);
		st.push(7);
		
		System.out.println(st.peek());
		st.delete();
		st.pop();
	}
}
