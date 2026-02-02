package FlowControl.Iterables;

import java.util.Scanner;

public class AmstrongNum {
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int digits = countDigit(n);
        int current = n;
        int sum = 0;

        while (current > 0) {
            int digit = current % 10;
            sum += Math.pow(digit, digits);
            current /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is Armstrong");
        } else {
            System.out.println(n + " is not Armstrong");
        }
        sc.close();
    }
}
//a number that equals the sum of its own digits, each raised to the power of the total number of digits. 
//For example, 153 is a 3-digit Armstrong number because \(1^{3}+5^{3}+3^{3}=1+125+27=153\). Other examples 370, 371, 407, 1634. 