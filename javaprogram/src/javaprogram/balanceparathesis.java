package javaprogram;

import java.util.Scanner;

public class balanceparathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner input=new Scanner(System.in);
//	        System.out.println("Enter the expression:");
	        String str="(((ab)";
	        int openp[] = new int[100];
	        int closep[] = new int[100];
	        int rmvp[] = new int[100];
	        int o=0,c=0,r=0;
	        for(int i=0;i<str.length();i++) {
	        	if(str.charAt(i)=='(') {
	        		openp[o]=i;
	        		o++;
	        	}
	        	if(str.charAt(i)==')') {
	        		closep[c]=i;
	        		c++;
	        	}
	        }
	        int higherp=(o>c)?1:2;
	        int pmath = Math.abs(o-c);
	        
	       for(int i=0;i<pmath;i++) {
	    	   if(higherp==1) {
	    		   o--;
	    		   rmvp[r]=openp[o];
	    		   r++;
	    	   }else if(higherp==2) {
	    		   c--;
	    		   rmvp[r]=closep[c];
	    		   r++;
	    	   }
	       }
	       int temp=-100;
	       if(r>0) {
	    	   r--;
	    	   temp=rmvp[r];
	    	   
	       }
	       
	       for(int i=0;i<str.length();i++) {
	    	   if(temp==i) {
	    		   if(r>0) {
	    			   r--;
	    			   temp=rmvp[r];
	    		   }
	    	   }else {
	    		   System.out.print(str.charAt(i));
	    	   }
	    	   
	       }
	 	}

}
