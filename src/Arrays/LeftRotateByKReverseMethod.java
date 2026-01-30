package Arrays;

public class LeftRotateByKReverseMethod {
    public static void rotateByK(int[] arr, int k){
        int n=arr.length;
        k=k%n;

        int[] temp = new int[k];

        //1:Storing K value
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        //2:Moving elements to left
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //3:Putting back
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
    }
    public static void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void optimalSoln(int[] arr, int k){
        int n=arr.length;
        k=k%n;

        reverse(arr, 0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr=ArraysIO.input();
        rotateByK(arr, 12);
        optimalSoln(arr, 5);
        ArraysIO.display(arr);
    }
}
