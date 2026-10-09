import java.util.*;

public class arrayprog {
    
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of array :");
    int sizeOfArray = scan.nextInt();
    int [] arr = new int[sizeOfArray];
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter the values of : "+(i+1));
        arr[i] = scan.nextInt();
    }
    int [] reverseArray = new int[arr.length];
    for(int i=0;i<arr.length;i++){
        reverseArray[i] = arr[arr.length - i - 1];
    }
    System.out.println("Original Array : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Reversed Array : ");
    for(int i=0;i<reverseArray.length;i++){
        System.out.print(reverseArray[i] + " ");
    }
    System.out.println();
    
}


}
