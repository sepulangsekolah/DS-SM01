// Initializing the elements of array
// to default values of blank (\b).
import java.util.*;
 public class InitCharArray {
     public static void main(String[] args) {
         char[] array=new char[10];
         // Column headings
         System.out.printf("%8s%8s\n", "Index", "Value");
         try {
             for(int cc=0;cc<array.length;cc++) {
                 if(array[cc]==' ') array[cc]='\b';
                 System.out.printf("%8s%8c\n", cc, array[cc]);
             }
         } catch(MissingFormatArgumentException e) {
             System.out.println(e); }
    }
}