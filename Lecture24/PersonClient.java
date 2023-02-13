package Lecture24;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "ram";
		p.age = 12;
		System.out.println(p);

	}

	static {
		System.out.println("Inside Static Block");
	}

}
