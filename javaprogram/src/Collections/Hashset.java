package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hash = new HashSet<String>();
		hash.add(":mullai");
		hash.add("vendhan");
		hash.add("P");
		System.out.println(hash);
		hash.remove("P");
		System.out.println(hash);
		System.out.println(hash.remove("P1"));
		
	}

}
