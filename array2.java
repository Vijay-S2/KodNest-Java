import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sizeOfArray= scan.nextInt();
        int []arr=new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
          arr[i]=scan.nextInt();
        }
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum+arr[i];
        }
        System.out.println("total sum:"+totalSum);
    }

}
