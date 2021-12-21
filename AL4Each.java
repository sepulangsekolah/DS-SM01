import java.util.*;
public class AL4Each{

 public static void main(String[] args) {
 // Create an ArrayList which going to contains a list of Numbers
 ArrayList<Integer> Numbers = new ArrayList<Integer>();

 // Add Number to list
 Numbers.add(23);
 Numbers.add(22);
 Numbers.add(45);
 Numbers.add(22);

 // forEach method of ArrayList and print numbers
 Numbers.forEach((n) -> System.out.println(n));
 }
} 