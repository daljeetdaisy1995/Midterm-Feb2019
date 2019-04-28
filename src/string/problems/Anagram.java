package string.problems;

import java.sql.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a = "CAT";
        String b = "ACT";
        String c = "ARMY";
        String d = "MARY";

        char e[] = a.toCharArray();
        char f[] = b.toCharArray();
        char g[] = c.toCharArray();
        char h[] = d.toCharArray();

        Arrays.sort(e);
        Arrays.sort(f);
        Arrays.sort(g);
        Arrays.sort(h);

        if(Arrays.equals(e,f ) || (Arrays.equals(g,h))) {
            System.out.println("Two Strings are Anagram");
        }else{
            System.out.println("Two Strings are not Anagram");

        }


    }
}
