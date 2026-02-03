package Strings.StringBuffer;

public class Methods {
    public static void main(String[] args) {
        String s = new String("java");

        System.out.println(s.charAt(0));
        System.out.println(s.concat("prog"));
        System.out.println(s.equals("Java"));
        System.out.println(s.equalsIgnoreCase("JAVA"));
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.replace('j', 't'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.substring(1));
        System.out.println(s.toUpperCase()); //JAVA
        System.out.println(s.toLowerCase()); //No object creation. just referencing ->java
    }
    
}
