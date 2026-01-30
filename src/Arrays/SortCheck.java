package Arrays;

public class SortCheck {

    public static boolean sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        System.out.println("Array sorted?(ascending)= "+sorted(arr));
    }
}
