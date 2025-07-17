
import java.util.Scanner;

class BinarySearchExercice{
    public static int BinarySearch(int[] Arr, int target){
        int low = 0; 
        int high = Arr.length - 1; 


        while (high >= low){
            int mid = (low + high) / 2;
            
            if ( Arr[mid] == target ){
                return mid; 
            }

            else if ( Arr[mid] > target){
                high = mid - 1; 
            }

            else {
                low = mid + 1; 
            }
        }

        return -1; 
    }
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        Scanner s = new Scanner(System.in);

        int target; 
        
        System.out.println("what number do you want to seaarch for? ");
        target = s.nextInt(); 
 
        if (BinarySearch(arr, target) == -1){
            System.out.println("target isnt in the array"); 
        }

        else {
            System.out.println("target was found at index: " + BinarySearch(arr, target));  
        }
        
        s.close();
    }
}