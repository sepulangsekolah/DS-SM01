// Initializing the elements of an array by parameter of main.
public class InitVarArray {
    public static void main(String... array){
        // Column headings
        if(array.length==0){
            System.out.println("Type n arguments:");
        }else {
            System.out.println("1234567812345678");
            System.out.println("================");
            System.out.printf("%8s%8s\n", "Index", "Value");
            for(int cc=0;cc<array.length;cc++)
                System.out.printf("%8s%8s\n", cc, array[cc]);
        }
    }
}