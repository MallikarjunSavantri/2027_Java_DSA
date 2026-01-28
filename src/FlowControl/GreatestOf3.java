package FlowControl;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int great = a;

        if (b > great) 
            great = b;
        if (c > great) 
            great = c;

        System.out.println("Greatest number: "+great);

        sc.close();
    }
}
