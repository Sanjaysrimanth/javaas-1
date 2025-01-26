import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        reverseArray(array);
        
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(String[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            // Swap elements
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
