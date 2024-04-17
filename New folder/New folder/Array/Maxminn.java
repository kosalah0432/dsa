import java.util.Arrays;

public class Maxminn{
    public static void main(String[] args) {
        int[] Arr = {12,34,56,78,98,76,55,34,5,1,23,45,67,100};
        int n = Arr.length; 
        String[] arr2 = {"A","C","E","D","B"};

        System.out.println("Array is : " +Arrays.toString(Arr));
        Arrays.sort(Arr);
        System.out.println("MAX is : " +Arr[n-1] +" \nMIN IS : " +Arr[0]);

        Arrays.sort(arr2);
        System.out.println("Array is : " +Arrays.toString(arr2));

        

    }
    
}
