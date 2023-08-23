package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] array = {"notepad","notepad","mouse","keyboard","mouse"};
		    Arrays.sort(array);
		    List <Integer> list = new ArrayList<Integer>();
		    int count=0;
		    for(int i=0;i<array.length;i++) {
		    	if(array[i].equals(array[i-1])) {
		    		
					count ++;
		    	}else {
		    		list.add(count);
		    		count=1;
		    	}
		    }
		    list.add(count);
		    System.out.println(list.toArray(new Integer[list.size()]));
		   	}

	

}
