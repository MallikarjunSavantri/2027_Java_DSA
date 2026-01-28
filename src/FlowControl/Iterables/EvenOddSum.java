package FlowControl.Iterables;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i <= num; i++) {
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("Even sum= "+evenSum+ ", Odd sum="+oddSum);
    }
    
}
