import java.util.Arrays;
public class CopyArray{
    public static void main(String[] args) {
        int[] arr4 = {12,23,45,67,98,76,54,34};
        int n=arr4.length;
        int[] arrcopy = new int[n];

        System.out.println("Initial Array is : " +Arrays.toString(arr4));

        for(int i=0;i<n;i++)
        {
            arrcopy[i] = arr4[i];
       }
       System.out.println("After Copied : " +Arrays.toString(arrcopy));
    }
}