/*
Exercise from coding game website. Name of exercise: The Descent.

The Goal:
Destroy the mountains before your starship collides with one of them. For that, shoot the highest mountain on your path.

Rules:
At the start of each game turn, you are given the height of the 8 mountains from left to right.
By the end of the game turn, you must fire on the highest mountain by outputting its index (from 0 to 7).

Firing on a mountain will only destroy part of it, reducing its height. Your ship descends after each pass.

Victory Conditions:
You win if you destroy every mountain

Lose Conditions:
Your ship crashes into a mountain
You provide incorrect output or your program times out

URL to exercise: https://www.codingame.com/training/easy/the-descent
Patryk Klimek
 */

package Zjazd2;

import java.util.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int maxMountainH = 0;
            int numMountain = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > maxMountainH){
                    maxMountainH = mountainH;
                    numMountain = i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");



            System.out.println(numMountain); // The index of the mountain to fire on.
        }
    }
}
