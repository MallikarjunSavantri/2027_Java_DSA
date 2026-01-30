package Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] arr = new int[10];
        double[] arr1 = new double[10];
        System.out.println(arr.getClass().getName());
        System.out.println(arr1.getClass().getName());
        System.out.println(arr);


        int[] arr2 = new int[10];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        System.out.println(arr2[2]);

        System.out.println("Length="+arr2.length);
    }
    
}
