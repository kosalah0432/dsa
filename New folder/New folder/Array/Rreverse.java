import java.util.Arrays;
import java.util.Collections;

public class Rreverse {
    public static void main(String[] args) {
        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Convert array to List, reverse it, and convert back to array
        Collections.reverse(Arrays.asList(arr));

        System.out.println("Reversed array: " + Arrays.toString(arr));

        int l=arr.length-1;

        for(int i=l;i>=0;i--){
            System.out.println(arr[i] +" ");
        }
    }
}
