package Arrays;

import java.util.Scanner;

public class ArraysIO {

    public static int[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}