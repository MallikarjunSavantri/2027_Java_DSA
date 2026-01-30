package Arrays;

public class EvenOddCount {
    public static void main(String[] args){   
    int[] arr = ArraysIO.input();
    int even = 0; 
    int odd = 0;

    for(int i=0;i<arr.length;i++){
        if (i%2==0){
            even++;
        }else{
            odd++;
        }
    }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

    }
}