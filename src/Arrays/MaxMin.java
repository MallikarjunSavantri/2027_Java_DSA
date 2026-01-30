package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    
}
