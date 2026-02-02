package TwoDArrays;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr= TwoDArrayIO.input();
        int colSize=arr[0].length;

        
        int maxValue=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<colSize;j++){
                if(arr[i][j]>maxValue){
                maxValue=arr[i][j];
                }
            }
            
        }
        System.out.println("Maximum value= "+maxValue);
    }
    
}
