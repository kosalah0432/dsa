import java.util.Arrays;
public class Revmanual{
    public static void main(String[] args) {
       
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the center
            start++;
            end--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
        System.out.println();

        int  n=arr.length;
        int[] arr3=new int[n];
        int j=0;

        for(int i=n-1;i>-1;i--)
        {
            
            arr3[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}

