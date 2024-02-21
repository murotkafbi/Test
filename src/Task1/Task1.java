package Task1;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.print("Original array: ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();


        int end = arr[n-1];
        System.out.println("Last element: " + end);
        System.out.print("Revised array: ");


        for(int i = n-2; arr[i] != end; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}