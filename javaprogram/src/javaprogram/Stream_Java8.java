package javaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		
		List<Integer> l = al.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
