package Lecture33;

public class Generics_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generics_Demo<Integer, String> k= new Generics_Demo<>();
		k.x=12;
		k.y="abc";
		System.out.println(k.x);
		System.out.println(k.y);
	}

}
