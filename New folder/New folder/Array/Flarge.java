
public class Flarge {

    public static void largest(int[] arr){
        int max = 0;
        max=arr[0];

        for(int i=0;i<arr.length;i++)
        {  
            if (arr[i] > max)
            {
                max=arr[i];
            }
        }
        System.out.println("max is :" +max);
    }
    public static void main(String[] args) {
        int[] arr3 = {12,3,45,56,78,90,123,23,100,5};

        Flarge.largest(arr3);
    }
}
