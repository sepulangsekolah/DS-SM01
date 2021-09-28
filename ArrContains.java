/* Java Program to check wether an element 
   is present in array or not */
import java.util.Arrays;
class ArrContains {
        /* Function return true if given element
           found in array */
        private static void check(Integer[] arr, int toCheckValue) {
            /* Check if the specified element is present in the
               array or not using constains() method */
            boolean test = Arrays.asList(arr).contains(toCheckValue);
            // Print the result
            System.out.println("Is "+ toCheckValue +
                " present in the array: " + test);
        }
        public static void main(String[] args) {
            // Get the array
            Integer arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
            // Get the value to be checked
            int toCheckValue = 10;
            // Print the array
            System.out.println("Array: " + Arrays.toString(arr));
            /* Check if this value is
               present in the array or not */
            check(arr, toCheckValue);
        } 
}