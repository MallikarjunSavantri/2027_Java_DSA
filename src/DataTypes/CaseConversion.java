package DataTypes;

import java.util.Scanner;

public class CaseConversion {

    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }
    public static char toUpper(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("Lowercase: " + toLower(c));
        System.out.println("Uppercase: " + toUpper(c));
    }
}