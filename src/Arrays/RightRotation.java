package Arrays;

public class RightRotation {

    public static void rRotate(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        rRotate(arr);
        ArraysIO.display(arr);
    }
}
