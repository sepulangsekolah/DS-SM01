import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ALRemove3 {
 public static void main(String[] args)
 {
 List<Integer> al = new ArrayList<>();
 al.add(10);
 al.add(20);
 al.add(30);
 al.add(35);
 al.add(40);
 System.out.println("Original ArrayList : " + al);

 // Remove elements smaller than 10 using
 // Iterator.remove()
 Iterator itr = al.iterator();
 while (itr.hasNext())
 {
 int x = (Integer)itr.next();
 if (x < 30)
 itr.remove();
 }

 System.out.println("Modified ArrayList : " + al);
 }
} 
