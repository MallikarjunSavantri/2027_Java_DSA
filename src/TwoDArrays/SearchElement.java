package TwoDArrays;

public class SearchElement {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIO.input();
        int colSize=arr[0].length;
        int key=4;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(arr[i][j]==key){
                    return ;
                }
            }
        }
        System.out.println("Element is present");
    }
    
}
