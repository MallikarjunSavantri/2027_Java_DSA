package FlowControl.Iterables;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        //TC=o(n)  SC=o(1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <=num ; i++){
            sum=sum+i;
        }
        System.out.println("Sum= "+sum);
    }
    
}
