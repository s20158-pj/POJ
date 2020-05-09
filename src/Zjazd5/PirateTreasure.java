/*
Author: Patryk Klimek
Summary: Exercise Pirate's Treasure from coding game website
Description:
Input:
Line 1: Width W of the treasure map.
Line 2: Height H of the treasure map.
Next H lines: W symbols (0 or 1) indicating free space (0) or obstacle (1).

Treasure is placed on free space surrounded by only obstacles.

There are three possible ways in which the treasure can be surrounded:
By 3 obstacles when the treasure is in the corner of the map.
By 5 obstacles when the treasure is on the edge of the map.
By 8 obstacles when the treasure is inside the map.

Output:
The coordinates of the treasure on the map are represented by indices separated by a space. For example: "12 5"

Position "0 0" is in the top left corner, so the maximum index x is W-1 and the maximum index y is H-1.

Constraints:
2 <= W <= 25
2 <= H <= 25
Only 1 treasure in map.
URL: https://www.codingame.com/training/easy/pirates-treasure
 */
package Zjazd5;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();

        System.err.println(W +"x"+ H);

        int[][] array = new int[H][W];

        for (int i = 0; i < H; i++) {

            for (int j = 0; j < W; j++) {
                int v = in.nextInt();
                array[i][j] = v;
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(array[i][j] == 0 && helper(array, i-1, j-1) == 1 && helper(array, i-1, j)== 1 &&
                        helper(array, i-1, j+1)== 1 && helper(array, i, j-1)== 1 && helper(array, i, j+1)== 1 &&
                        helper(array, i+1, j-1)== 1 && helper(array, i+1, j)== 1 && helper(array, i+1, j-1)== 1
                ) {
                    System.out.print(j + " " + i);
                    return;
                }
            }
        }
    }

    public static int helper(int [][]array, int width, int height) {
        if(width == -1 || height == -1 || width >= array.length || height >= array[width].length || width < 0 || height < 0){
            return 1;
        } else {
            return array[width][height];
        }
    }
}
