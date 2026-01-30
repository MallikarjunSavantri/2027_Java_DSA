package Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];

        System.out.println("Enter elements of both arrays:");

        for (int i=0;i<size;i++) {
            System.out.print("Array1["+i+"]= ");
            arr1[i] =sc.nextInt();
            System.out.print("Array2["+i+"]= ");
            arr2[i] =sc.nextInt();

            arr3[i] =arr1[i] +arr2[i];
        }

        System.out.println("Resulted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr3[i] + "");
        }
        sc.close();
    }
}
