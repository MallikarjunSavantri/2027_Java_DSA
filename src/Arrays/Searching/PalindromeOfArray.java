package Arrays.Searching;

import Arrays.ArraysIO;

public class PalindromeOfArray {
    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = ArraysIO.input();
        System.err.println("Is array in Palindrome?: "+isPalindrome(arr));
        
    }
}
