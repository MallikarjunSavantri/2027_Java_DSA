package Arrays;

public class LeftRotateByK {
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
    
    public static void main(String[] args) {
        int[] arr=ArraysIO.input();
        rotateByK(arr, 12);
        ArraysIO.display(arr);
    }
}
