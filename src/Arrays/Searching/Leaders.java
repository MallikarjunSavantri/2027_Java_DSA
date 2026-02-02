package Arrays.Searching;

import Arrays.ArraysIO;

public class Leaders {
    public static void solution(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1 ;i>=0; i--){
            if(arr[i]>=max){
                System.out.println(arr[i]+" ");
                max=arr[i];
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr=ArraysIO.input();
        System.out.println("leading element of array:");
        solution(arr);
    }
}
