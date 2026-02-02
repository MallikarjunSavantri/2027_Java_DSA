package Strings;

public class Examples {
    public static void main(String[] args) {
        ex4();9
    }
        public static void ex4(){
        String s1=new String("You can't change me");
        String s2=new String("You can't change me");

        String s3="You can't change me";
        System.out.println(s1==s3);

        String s4="You can't change me";
        System.out.println(s3==s4);

        String s5="You can't " + "change me";
        System.out.println(s4==s5);

        String s6="You can't ";
        String s7=s6+"change me";
        System.out.println(s4==s7);

        final String s8="You can't";
        String s9=s8+"change me";
        System.out.println(s4==s9);
        
    }

    
}

