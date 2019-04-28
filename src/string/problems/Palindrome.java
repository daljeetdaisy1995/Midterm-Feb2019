package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        String  a = "MOM";
        String reverse = ""; //Obj of string class




        for (int i = a.length() - 1; i >= 0; i--)
            reverse = reverse + a.charAt(i);

        if (a.equals(reverse))
            System.out.println("Word is a palindrome." +a);
        else
            System.out.println("Word isn't a palindrome." +a);

    }
}
