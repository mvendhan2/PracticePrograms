package javaprogram;

import java.util.function.Consumer;

interface consumer<T>{
	
}
public class Consumer_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s->System.out.println(s);
		c.accept("Mullai");
	}

}
