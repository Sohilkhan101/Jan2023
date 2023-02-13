package Lecture23;

public class Person {
	private String name;
	private int age;

	public Person() {
//		this.age=10;
//		this.name="hello";
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		try {
		if(age<0) {
			 throw new Exception("Age is less then 0");
		}
		this.age = age;
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}
		
		
	}

	public void intro() {
		System.out.println("Name :" + this.name + " Age :" + this.age);
	}

}
