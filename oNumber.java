
import java.util.Scanner;

class oNumber {

    static class Totalsum {
        int totalSum;

        Totalsum(int totalSum, int temp, int numberC, int digits) {
            this.totalSum = totalSum;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numberC = scan.nextInt();

        int temp = numberC;
        int digits = 0;
        int number_t;

        // Count the digits
        int n = numberC;
        while (n != 0) {
            digits++;
            n = n / 10;
        }

        numberC = temp;
        int sum = 0;

        // Calculate the sum of each digit raised to digits
        while (numberC != 0) {
            number_t = numberC % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * number_t;
            }

            sum = sum + power;
            numberC = numberC / 10;
        }

        System.out.println("totalSum : " + sum);

        if (sum == temp) {
            System.out.println("Can");
        } else {
            System.out.println("Can't");
        }

        scan.close();
    }
}
