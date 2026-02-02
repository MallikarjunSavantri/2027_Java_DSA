package TwoDArrays;

public class SumOfEachColumn {
    public static void main(String[] args) {
        int[][] arr=TwoDArrayIO.input();
        int colSize=arr[0].length;
        TwoDArrayIO.print(arr);

        for(int j=0;j<colSize;j++){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i][j];
            }
            System.out.println("sum of column "+(j+1)+" is: "+sum);   //j+1 because it starts with column 1, otherwise col 0
        } 
    }
    
}
