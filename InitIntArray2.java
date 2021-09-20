// Initializing the elements of an array to
// Default values of zero.
public class InitIntArray2 {
    public static void init(int size){
        int[] array=new int[10];
        // Column headings
            System.out.printf("%8s%8s\n", "Index", "Value");
            for(int cc=0;cc<array.length;cc++)
                System.out.printf("%8s%8s\n", cc, array[cc]);
        }
    public static void main(String[] args){
        init(10);
    }
}