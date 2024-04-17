import java.util.Arrays;
import java.util.Scanner;
public class Rremove{
    public static void main(String[] args) {
       

        int[] arr2={23,45,67,89,0,100,120};
        System.out.println();
        System.out.println(Arrays.toString(arr2));

        int delete=100;
        int index=-1;

        for(int i=0;i<arr2.length-1;i++){
            if(arr2[i] == delete){
                index=i;
                break;
            }
        }
        
        for(int j=index;j<arr2.length-1;j++){
            arr2[j]=arr2[j+1];
         }
         arr2=Arrays.copyOf(arr2, arr2.length-1);
         System.out.println(Arrays.toString(arr2));
        }
       
    
    }

    
    

