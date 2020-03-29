/*
Author: Patryk Klimek
Summary: Exercise from coding game website. Name of exercise: Shadow of the Knight - Episode 1.

The Goal:
Batman will look for the hostages on a given building by jumping from one window to another using his grapnel gun.
Batman's goal is to jump to the window where the hostages are located in order to disarm the bombs.
Unfortunately he has a limited number of jumps before the bombs go off...

Rules:
Before each jump, the heat-signature device will provide Batman with the direction of the bombs based on Batman current position:

U (Up)
UR (Up-Right)
R (Right)
DR (Down-Right)
D (Down)
DL (Down-Left)
L (Left)
UL (Up-Left)


Your mission is to program the device so that it indicates the location of the next window Batman should jump to in
order to reach the bombs' room as soon as possible.

Buildings are represented as a rectangular array of windows, the window in the top left corner of the building is at index (0,0).

URL to exercise: https://www.codingame.com/training/medium/shadows-of-the-knight-episode-1
 */
package Zjazd3;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Wmax = in.nextInt(); // width of the building.
        int Wmin = 0;
        int Hmax = in.nextInt(); // height of the building.
        int Hmin = 0;
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            switch (bombDir){
                case "U":
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "UR":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "R":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    break;
                case "DR":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "D":
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "DL":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "L":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    break;
                case "UL":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
            }

            // the location of the next window Batman should jump to.
            System.out.println(X0+" "+Y0);
        }
    }
}
