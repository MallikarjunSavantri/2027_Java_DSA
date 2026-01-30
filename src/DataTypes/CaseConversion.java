package DataTypes;

import java.util.Scanner;

public class CaseConversion {

    //a = 97 to 112
    //A= 65 to 90
    public static char conversionLow(char c){
        if(c>=65 && c<=90){
            return (char)(c+32);
        }else{
            return c;
        }
    }
    public static char conversionUp(char c){
        if(c>=97 && c<=112){
            return (char)(c-32);
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        char c = sc.next().charAt(0);
        
        System.out.println(conversionLow(c));
        System.out.println(conversionUp(c));
    }
}
