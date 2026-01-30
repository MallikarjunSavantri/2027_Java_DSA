package Arrays;

public class SumOfElements {
    public static void main(String[] args) {

        // int[] arr = new int[10];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter array size: ");
        // int size= sc. nextInt();

        // for(int i=0; i<size; i++){
        //     System.out.print("enter element at index "+i+":");
        //     arr[i]=sc.nextInt();
        // }
        // int sum=0;
        // for(int i=0; i<size; i++){
        //     System.out.println(arr[i]+"");
        //     sum=sum+arr[i];
        // }
        // System.out.println("Sum of elements in array= "+sum);
        // sc.close();
    int maxSize=5;
    int[] arr1= ArraysIO.input();
    int[] arr2 = ArraysIO.input();
    int[] result = new int[maxSize];

    for(int i=0;i<maxSize;i++){
        result[i]=arr1[i]+arr2[i];
    }
    System.out.println("Sum of correspond elements");
    ArraysIO.display(result);
    }
}