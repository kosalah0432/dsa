import java.util.Arrays;
import java.lang.Math;
public class DuplArray{
    public static void main(String[] args) {
        int[] arr = {23,45,76,54,23,87,65,2,346,778,98};
        int n1=arr.length;
        int[] arr2 = {1,18,543,234,45,58,98,65,98};
        int n2=arr2.length;
        int[] arr3= new int[Math.min(n1, n2)];
        int count = 0;
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i] == arr2[j]){
                    // u can simply print here.no need any count.this is for ur knowledge.
                    arr3[count]=arr[i];
                    count++;
                }
            }
        }
        /*
         * So, Arrays.copyOf(arr3, count) creates a new array with the exact size 
         * needed to hold all the common elements found. 
         * The reference to this new array is then assigned back to the variable arr3,
         * effectively updating it with the properly sized array.
         */

        arr3=Arrays.copyOf(arr3, count);
        System.out.println(Arrays.toString(arr3));
    }
    
}
