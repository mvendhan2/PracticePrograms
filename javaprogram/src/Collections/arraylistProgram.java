package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arraylistProgram {

	public static void main(String[] args) {

//		List<String> ls = new ArrayList<String>();
//		ls.add("Mullai");
//		ls.add("vendhan");
//		System.out.println(ls);
//		ls.add(1,"P");
//		System.out.println(ls);
//		
//		//all
//		List<Integer> ls1 = new ArrayList<Integer>();
//		ls1.add(2);
//		ls1.add(3);
//		ls1.add(5);
//		ls1.add(7);
//		ls1.add(11);
//		
//		List<Integer> ls2 = new ArrayList<>(ls1);
//		List<Integer> l3 = new ArrayList<>();
//		l3.add(13);
//		l3.add(17);
//		l3.add(19);
//		l3.add(23);
//		l3.add(29);
//		
//		ls2.addAll(l3);
//		System.out.println("ls1 -"+ls1);
//		System.out.println("ls2 -"+ls2);
//		System.out.println("l3 -"+l3);
//
//		List<String> programmingLanguages = new ArrayList<>();
//        programmingLanguages.add("C");
//        programmingLanguages.add("C++");
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Kotlin");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("Perl");
//        programmingLanguages.add("Ruby");
//
//        System.out.println("Initial List: " + programmingLanguages);
//        
//     // Remove the element at index `5`
//        programmingLanguages.remove(5);
//        System.out.println("After remove(5): " + programmingLanguages);
//        
//     // Remove the first occurrence of the given element from the ArrayList
//        // (The remove() method returns false if the element does not exist in the ArrayList)
//        boolean isRemoved = programmingLanguages.remove("Kotlin");
//        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
//        
//     // Remove all the elements that exist in a given collection
//        List<String> scriptingLanguages = new ArrayList<>();
//        scriptingLanguages.add("Python");
//        scriptingLanguages.add("Ruby");
//        scriptingLanguages.add("Perl");
//        
//        programmingLanguages.removeAll(scriptingLanguages);
//        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
//        
//        // Remove all the elements that satisfy the given predicate
//        programmingLanguages.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("C");
//            }
//        });
//        
//        /*
//        The above removeIf() call can also be written using lambda expression like this -
//        programmingLanguages.removeIf(s -> s.startsWith("C"))
//    */
//
//    System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);
//
//    // Remove all elements from the ArrayList
//    programmingLanguages.clear();
//    System.out.println("After clear(): " + programmingLanguages);

//		List<String> tvShows = new ArrayList<>();
//        tvShows.add("Breaking Bad");
//        tvShows.add("Game Of Thrones");
//        tvShows.add("Friends");
//        tvShows.add("Prison break");
//
//        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
//       tvShows.forEach(tvShow ->{
//    	   System.out.println(tvShow);
//       });
//       
//       System.out.println("\n=== Iterate using an iterator() ===");
//       Iterator<String> tvShowIterator = tvShows.iterator();
//       while (tvShowIterator.hasNext()) {
//           String tvShow = tvShowIterator.next();
//           System.out.println(tvShow);
//       }
//
//       System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
//       tvShowIterator = tvShows.iterator();
//       tvShowIterator.forEachRemaining(tvShow -> {
//           System.out.println(tvShow);
//       });
//
//       System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
//       // Here, we start from the end of the list and traverse backwards.
//       ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
//       while (tvShowListIterator.hasPrevious()) {
//           String tvShow = tvShowListIterator.previous();
//           System.out.println(tvShow);
//       }
//
//       System.out.println("\n=== Iterate using simple for-each loop ===");
//       for(String tvShow: tvShows) {
//           System.out.println(tvShow);
//       }
//
//       System.out.println("\n=== Iterate using for loop with index ===");
//       for(int i = 0; i < tvShows.size(); i++) {
//           System.out.println(tvShows.get(i));
//       }
       
	}
}
