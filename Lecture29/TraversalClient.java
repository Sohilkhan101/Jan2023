package Lecture29;

public class TraversalClient {
	public static void main(String[] args) {
		Traversal t= new Traversal();
		t.preOurder();
		System.out.println();
		t.inOurder();
		System.out.println();
		t.postOurder();
		System.out.println();
		t.levelOurder();
		
	}

}


//10 true 20 true 30 false false false true 40 true 50 false false true 60 true 70 false false false