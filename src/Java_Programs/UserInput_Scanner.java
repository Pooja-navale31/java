package Java_Programs;

import java.util.Scanner;

public class UserInput_Scanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age =sc.nextInt();
        System.out.println("Hello " +name + " your age is" +age);
        sc.close();
    }

}
