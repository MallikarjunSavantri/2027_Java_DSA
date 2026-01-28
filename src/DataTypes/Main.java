package DataTypes;

public class Main{
    public static void main(String[] args) {
        
        byte b=4;
        System.out.println("Byte value: "+b);
        System.out.println(Byte.SIZE);

        short s=14;
        System.out.println("Short value: "+s);
        System.out.println(Short.SIZE);

        int i=4;
        System.out.println("Int value: "+i);
        System.out.println(Integer.SIZE);

        float f=9.8f;
        System.out.println("Float value: "+f);
        System.out.println(Float.SIZE);

        boolean boo=false;
        System.out.println("Boolean value: "+boo);
        System.out.println(Boolean.TYPE);
    }
}