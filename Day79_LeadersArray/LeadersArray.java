import java.util.Arrays;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {4,4,5,5,6,4,4,5};
        System.out.println("Array: " + Arrays.toString(arr));
        printLeaders(arr);
    }

    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        System.out.println("Leaders: " + max);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Leaders: " + max);
            }
        }
    }
}
