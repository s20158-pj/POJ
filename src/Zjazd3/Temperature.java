/*
Author: Patryk Klimek
Summary: Exercise from coding game website. Name of exercise: Temperature.

In this exercise, you have to analyze records of temperature to find the closest to zero.

Sample temperatures:
Here, -1 is the closest to 0.

Rules:
Write a program that prints the temperature closest to 0 among input data. If two numbers are equally close to zero,
positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).

Game Input:
Your program must read the data from the standard input and write the result on the standard output.

Input:

Line 1: N, the number of temperatures to analyze
Line 2: A string with the N temperatures expressed as integers ranging from -273 to 5526

Output:
Display 0 (zero) if no temperatures are provided. Otherwise, display the temperature closest to 0.

URL to exercise: https://www.codingame.com/training/easy/temperatures
 */
package Zjazd3;

import java.util.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result = 5526;
        if (n == 0) {
            result = 0;
        }
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if (Math.abs(t) < Math.abs(result)) {
                result = t;
            } else if (Math.abs(t) == Math.abs(result) && t > result){
                result = t;
            }


        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}
