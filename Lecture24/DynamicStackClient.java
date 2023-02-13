package Lecture24;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Stack st = new Dynamic_Stack();
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(100);
		st.push(120);
		st.push(130);
		st.Display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.Display();
		System.out.println(st.Size());

	}

}
