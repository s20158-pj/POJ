/*
Author: Patryk Klimek
Summary: Class to check if a number is an armstrong number.
 */
package Zjazd4;

public class ArmstrongNumbers {

    public boolean Armstrong(int number) {

        int result = 0;
        for (String s : String.valueOf(number).split("")) {
            int n = Integer.parseInt(s);
            result += n * n * n;
        }
        return result == number;
    }
}
