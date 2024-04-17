import java.util.Arrays;

public class Addspecificpos{
    public static void main(String[] args) {
        int [] arr = {23,26,29,32,38};
        System.out.println("Elements before : " +Arrays.toString(arr));

        int val,pos,n,i;
        val =35;
        pos=2;
        n=arr.length;

        for( i= n-1 ; i > pos ; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos]=val;
        System.out.println("After insertion   : " +Arrays.toString(arr));
    }
}
