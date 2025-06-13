package Java_Task;

public class Ternary_Operator
{
    public static void main(String[] args) {
        int a=5;
        int b=9;
        int max = (a>b) ? a:b;
        int min = (a<b)?a:b;
        System.out.println("maz number" + max);
        System.out.println("min number" +min);

        String result=(a%2==0) ? "Even" : "Odd";
        System.out.println(result);

        //grade calculator
        int marks =96;
        String grade = (marks >=90 ) ?"A" : (marks >=80) ? "B" : (marks >=70) ? "C" : (marks >=60) ? "D" :"Fail";
        System.out.println(grade);

    }
}
