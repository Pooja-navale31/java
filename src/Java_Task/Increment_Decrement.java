package Java_Task;

public class Increment_Decrement {
    public static void main(String[] args) {
        int a = 5;

        int b = a++;   //5
        System.out.println(b);
        System.out.println("a: " + a + ", b: " + b);

        //programme 2
        int i = 1;

        i = i++ + ++i; //1+3
        System.out.println(i);

        //programme 3
        int x = 5;

        System.out.println(x++ + ++x);  //5+7 =12

        //programme 4
        int y = 5;

        System.out.println(++y); // Output: 6
        System.out.println(y++); // Output: 6
        System.out.println(y);   // Output: 7

        //programme 5
        int c = 5;
        int d = c++ + ++c;  //5+7 =12

        System.out.println("c: " + c); // Output: 7
        System.out.println("d: " + d); // Output: 12

        //programe 6
        int m = 5;

        int n = m++ + ++m + m++ + ++m;  //5 + 7 +7+9 =28

        System.out.println("m = " + m + ", n = " + n);  // m=9 n=28

        //progamme 7



    }
}
