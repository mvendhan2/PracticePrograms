package javaprogram;

import java.util.function.Supplier;

public class Suppiler_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()->{
			String str[]= {"mullai","vendhan","mullai","vendhan"};
			int x = (int)(Math.random()*3+1);
			return str[x];
		};
		System.out.println(s.get());
		
	}

}
