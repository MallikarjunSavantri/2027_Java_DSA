package Strings;

public class Examples {
   
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
    public static void ex5(){
        String s=new String("java");
        String s2=s.toUpperCase();
        String s3=s2.toLowerCase();
        System.out.println(s==s2);
        System.out.println(s==s3);

    }
    public static void ex6(){
        String s1="java";
        String s2=s1.toString();
        String s3=s2.toLowerCase();
        String s4=s3.toUpperCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
    }

    public static void ex7(){
        String s=" ";
        s.trim();
        System.out.println(s.equals("")+" "+s.isEmpty());
    }

    public static void ex8(){
        String s="Hello world";
        s.trim();
        int index=s.indexOf(" ");
        System.out.println(index);
    }

    public static void ex9(){
        String s="java";
        String s2= new String("Java!");
        if(s.equalsIgnoreCase(s2)){      //if(s1.toLower()=s2.toLower())
            System.out.println("Equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void ex10(){
        StringBuffer sb = new StringBuffer(5);
        String s="";
        if(sb.equals(s)){
            System.out.println("match1");
        }else if(sb.toString().equals(s.toString())){
            System.out.println("match2");
        }else{
            System.out.println("no match");
        }
    }


     public static void main(String[] args) {
        ex10();
    }
}