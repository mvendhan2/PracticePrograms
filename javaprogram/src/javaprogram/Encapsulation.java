package javaprogram;

class m {
	private String name;
	private int age;

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}
}

public class Encapsulation extends m{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en = new Encapsulation();
		en.setAge(23);
		en.setName("Mullai");
		System.out.println(en.getAge()+" "+en.getName());
		
	}

}
