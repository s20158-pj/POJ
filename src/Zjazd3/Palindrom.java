/*
Author: Patryk Klimek
Summary: Class which check if word or sentence is a palindrome.
 */
package Zjazd3;

public class Palindrom {

    public static void main(String[] args) {

        isPalindrome("Atak kata.");
        isPalindrome("Muzo, raz daj jad za rozum.");
        isPalindrome("Wódy żal dla żydów.");
        isPalindrome("Zupa dupa lupa.,");

    }

    private static void isPalindrome(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--)
            reversed += text.charAt(i);
        reversed = reversed.toLowerCase().replaceAll(" ", "").replace(",", "").replace(".", "");
        text = text.toLowerCase().replaceAll(" ", "").replace(",", "").replace(".", "");
        if (reversed.equals(text)) {
            System.out.println("To jest palindrom.");
        } else {
            System.out.println("To nie jest palindrom.");
        }
    }
}
