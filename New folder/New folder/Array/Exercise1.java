import java.util.Arrays;
import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        String[] arr = new String[10];
        System.out.println("enter Students names : ");
        Scanner sc = new Scanner(System.in);
        int i=0;

        while (i < 5) {
            String input = sc.nextLine();

            if (input == null|| input.equals("") ) {
                System.out.println("Stopping input as blank line entered.");
                break;
            } else {
                arr[i] = input;
                i++;
            }
            
        }
        arr=Arrays.copyOf(arr, i);
        System.out.println(Arrays.asList(arr));
        int l=arr.length;
        int j;
        int[] arr2 = new int[5];

        for( j = 1 ;j <= l ;j++)
            {
                arr2[j-1]=j;
            }
            
            arr2=Arrays.copyOf(arr2,i);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Check : 1");

        for(inkt k= 0;k<i;)
    }
}
