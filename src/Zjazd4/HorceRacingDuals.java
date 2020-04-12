/*
Author: Patryk Klimek
Summary: Exercise from coding game website. Name of exercise: Horse-racing Duals.


The Goal:
Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will participate
in the race. In order for the race to be interesting, it is necessary to try to select two horses with similar strength.

Write a program which, using a given number of strengths, identifies the two closest strengths and shows their
difference with an integer (≥ 0).

Input:
Line 1: Number N of horses
The N following lines: the strength Pi of each horse. Pi is an integer.

Output:
The difference D between the two closest strengths. D is an integer greater than or equal to 0.

URL to exercise: https://www.codingame.com/training/easy/horse-racing-duals
 */
package Zjazd4;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        ArrayList<Integer> racingHorses = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int Pi = in.nextInt();
            in.nextLine();
            racingHorses.add(Pi);
        }
        Collections.sort(racingHorses);

        int gap = 1000;
        int temp = 0;
        for (int i = 0; i < racingHorses.size() - 1; i++) {
            temp = racingHorses.get(i + 1) - racingHorses.get(i);
            if (temp < gap) {
                gap = temp;
            }
        }
        System.out.println(gap);
    }
}
