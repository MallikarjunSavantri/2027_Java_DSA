package TwoDArrays;

import java.util.Scanner;

public class TwoDArrayIO {
    
    public static int[][] input(){
        Scanner sc = new Scanner(System.in);
        int row=3;
        int column=3;
        int[][] arr=new int[3][3];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter element at index "+i+","+j+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    public static void print(int[][] arr){
        int rowSize=arr.length;
        int colSize=arr.length;
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr=input();
        print(arr);
    }
}


