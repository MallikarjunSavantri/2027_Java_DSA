package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }    
}
