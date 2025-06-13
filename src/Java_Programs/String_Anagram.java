package Java_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Enter string 1");
        System.out.println("Enter String 2");

        if (areAnagrams(s1, s2)) {
            System.out.println("String anagrams");
        } else
            System.out.println("Not Anagram");

    }


    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }


        // Sort the characters of the strings
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

}