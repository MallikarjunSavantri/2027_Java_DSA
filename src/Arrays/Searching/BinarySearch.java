package Arrays.Searching;

import Arrays.ArraysIO;

public class BinarySearch {
    public static int binary(int[] arr, int key){
        int n=arr.length;
        int left =0;
        int right = n-1;
         while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        int result=binary(arr, 4);
        if(result<0){
            System.out.println("element not present");
        }else{
            System.out.println("element is at index: "+result);
        }
    }
}
