package Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int j=0;
        int[] arr= ArraysIO.input();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        ArraysIO.display(arr);
    }
    
}