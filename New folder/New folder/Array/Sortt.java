import java.util.Arrays;
public class Sortt{
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,7,6,8,5,9,10};
        System.out.println("Array before sort : " +Arrays.toString(arr));
        System.out.println();
        Arrays.sort(arr); 
        System.out.println("Array after sort : " +Arrays.toString(arr));

        System.out.println("Second largest Array: " +arr[1]);
    }
}