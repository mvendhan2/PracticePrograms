package javaprogram;

public class BasicsOfJAVA {
	
	static int count = 0;
	
	String fname ;
	String lname;
	static String school;

	BasicsOfJAVA(){
		count++;
		System.out.println(count);
	}
	
	BasicsOfJAVA(String firstname,String lastname, String school){
		this.fname = firstname;
		this.lname =  lastname;
		this.school = school;
	}
	
	BasicsOfJAVA(String firstname,String lastname){
		this.fname = firstname;
		this.lname =  lastname;
	}
	
	static
    {
        // Print sdstatement
        System.out.print(
            "Static block can be printed without main method");
    }
	
	public static void main(String[] args) {
		
	
		BasicsOfJAVA j = new BasicsOfJAVA("mullai","vendhan","KPRSchool");
		BasicsOfJAVA j3 = new BasicsOfJAVA("mullai","vendhan1");
		BasicsOfJAVA j1 = new BasicsOfJAVA();
		BasicsOfJAVA j2 = new BasicsOfJAVA();
		j.name();
		j3.name();
	
	}
	
	public  void name() {
		int a =10;
		int b = 20;
		System.out.println((a==b)?"true":"false");
		int arr[]= {1,2,3,4};
		for(int s:arr)
			System.out.println(s);
		System.out.println(this.fname+" "+this.lname+" "+this.school);
	}
	
	
		
}
