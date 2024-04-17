public class Felement{

    public static void findElement(int[] arr2,int value){
        int n = arr2.length;
        boolean found=false;
          for(int i=0;i<n;i++)
            {
                if(arr2[i] == value)
                {   
                    System.out.println("ELEMENT FOUND IN " +(i+1) +" INDEX" );
                    found=true;
                    break;
                   
                }
            }
            if(!found)
                {
                    System.out.println("NOT FOUND !!!!!!!!");
                }
        }
       
    
    public static void main(String[] args) {
        
        int[] arr2 = {12,34,56,78,98,9,87,65};
        Felement.findElement(arr2,56);
    }
}