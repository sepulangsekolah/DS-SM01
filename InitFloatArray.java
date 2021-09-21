// Initializing the elements of array
// to default values of zero.
import java.util.*;
 public class InitFloatArray {
     public static void main(String[] args) {
         float[] array=new float[10];
         // Column headings
         System.out.printf("%8s%8s\n", "Index", "Value");
         try {
             for(int cc=0;cc<array.length;cc++)
                System.out.printf("%8s%8.2f\n", cc, array[cc]);
         } catch(MissingFormatArgumentException e) {
                System.out.println(e); }
    }
}