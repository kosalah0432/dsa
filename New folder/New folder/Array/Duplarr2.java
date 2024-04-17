   // Import the Arrays class from the java.util package.
   import java.util.Arrays;
public class Duplarr2{    
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        // Iterate through the elements of the array.
        for (int i = 0; i < my_array.length-1; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                // Check if two elements are equal and not the same element.
                /*
                 * i != j: This part ensures that the duplicate elements found are not the same element at the same position.
                 *  If i is equal to j, it means the elements are the same, and it doesn't consider it as a duplicate.
                 */
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element : " + my_array[j]);
                }
            }
        }
    }    
}

