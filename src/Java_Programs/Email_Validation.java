package Java_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
    public static void main(String[] args) {
        String email = "johnexample.com";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";


        Pattern pat = Pattern.compile(emailRegex);
        Matcher mat = pat.matcher(email);

        if (mat.matches())
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

    }
}



