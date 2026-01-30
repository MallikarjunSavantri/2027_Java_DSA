package Arrays;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++) {
            if (i<min){
                secondMin=min;
                min = i;
            } else if(i<secondMin&&i!=min){
                secondMin = i;
            }
        }

        System.out.println("Second Minimum: " + secondMin);
    }
}