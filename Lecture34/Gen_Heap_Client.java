package Lecture34;

public class Gen_Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen_Heap <String> h= new Gen_Heap<>();
		h.add("abc");
		h.add("zef");
		h.add("ghi");
		h.add("jkl");
		h.add("mno");
		h.size();
		h.display();
		h.remove();
//		h.remove();
		h.size();
		h.display();

	}

}