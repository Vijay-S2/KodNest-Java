import java.util.Scanner;

class student {
    String name;
    int id;
    String course;
    double javascore;
}

public class java2l {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        student s1 = new student();
        s1.name = scan.nextLine();
        s1.id = scan.nextInt();
        scan.nextLine(); // consume newline left by nextInt()
        s1.course = scan.nextLine();
        s1.javascore = scan.nextDouble();
        scan.nextLine(); // consume newline left by nextDouble()

        student s2 = new student();
        s2.name = scan.nextLine();
        s2.id = scan.nextInt();
        scan.nextLine(); // consume newline left by nextInt()
        s2.course = scan.nextLine();
        s2.javascore = scan.nextDouble();

        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javascore);

        System.out.println("Name: " + s2.name);
        System.out.println("ID: " + s2.id);
        System.out.println("Course: " + s2.course);
        System.out.println("Java Score: " + s2.javascore);

        scan.close();
    }
}

