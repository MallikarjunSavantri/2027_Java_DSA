package TwoDArrays;

public class UpperDiagonal {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIO.input();
        int colSize=arr[0].length;
        TwoDArrayIO.print(arr);
        System.out.println("Upper diagonal elements:");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(i<j){                                 //lower diagonal--> (i>j)
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
