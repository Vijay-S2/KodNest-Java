import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int sizeOfArray=sc.nextInt();
        int []arr=new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value of : "+ (i+1));
            arr[i]=sc.nextInt();
        }
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        System.out.println("The sum of array is "+totalSum);


        
    }

}
