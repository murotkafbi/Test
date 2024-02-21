package task4;

import java.util.Scanner;

public class Task4 {
    public static int minMoves(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else if (nums.length == 2) {
            int diff = Math.abs(nums[0] - nums[1]);
            return diff <= 1 ? 1 : 2;
        } else {
            int result = 2 * (nums.length - 1);
            for (int i = 1; i < nums.length; i++) {
                result += Math.min(Math.);
            } ;
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(minMoves(nums));
    }
}

