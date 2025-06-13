package Java_Task;

public class Typecasting {
    public static void main(String[] args) {
      // Implicit Typecasting (Widening)
       int A =100;
       double d = A;
        System.out.println(d);

        // Explicit Typecasting (Narrowing)
        double dob =12.0;
        int B = (int)dob ;
        System.out.println(B);

        //character to ASCII
        char ch='A';
        int myint =(int)ch;
        System.out.println(myint);
    }


}
