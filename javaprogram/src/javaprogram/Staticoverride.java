package javaprogram;

class Parent 
{
    public  void display()
    {
        System.out.println("Welcome to Parent Class");
    }
}
public class Staticoverride extends Parent
{
    public  void display()
    {
        System.out.println("Welcome to Child class");
    }
    public static void main(String args[]) 
    {
        //Assign Child class object to Parent reference
    	Parent pc = new Staticoverride();
        pc.display();
     }
}