import java.util.Arrays;

public class Exer2 {
    public static void main(String[] args) {
        int[] array = {78, 89, 90, 12, 65};
        int length = array.length;
        boolean check = false;
        int find = 90;

        for (int i = 0; i < length; i++) {
            if (array[i] == find) {
                System.out.println("Index found in position: " + (i + 1));
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Index not found!!");
        }

        int pos=3,value=45;

        for(int i=pos-1;i > pos; i--)
        {
            array[i]=array[i-1];
        }

        array[pos]=value;
        System.out.println(Arrays.toString(array));

        for(int i =0;i<array.length;i++)
        {
            if(array[i]==89)
            {
                System.out.println(i);
            }
        }
        for(int i = 1;i < array.length-1 ; i++)
        {
            array[i]=array[i+1];
        }
        array=Arrays.copyOf(array, 4);
        System.out.println(Arrays.toString(array));
    }
}
