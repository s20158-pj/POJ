/*
Draw Polish and Japanese flag with ASCII symbols
Patryk Klimek
 */
import java.util.Scanner;

public class Zad1 {
        static void printFlag(String flag[][], int size){
        for (int i=0; i<10; i++) {
            if (i % size == 0) {
                for (int j = 0; j < 16; j++) {
                    if(j % size==0) System.out.print(flag[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [][] polishFlag = new String[10][16];
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 16; j++) {
                if(i<5) polishFlag[i][j] = "...";
                else polishFlag[i][j] = "MMM";
            }
        }
        String [][] japanFlag = new String[10][16];
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 16; j++) {
                japanFlag[i][j] = "...";
            }
        }
        for(int i = 0; i<1; i++) japanFlag[2][7+i]="@@@";
        for(int i = 0; i<3; i++) japanFlag[3][6+i]="@@@";
        for(int i = 0; i<5; i++) japanFlag[4][5+i]="@@@";
        for(int i = 0; i<5; i++) japanFlag[5][5+i]="@@@";
        for(int i = 0; i<3; i++) japanFlag[6][6+i]="@@@";
        for(int i = 0; i<1; i++) japanFlag[7][7+i]="@@@";

        System.out.println("Wybierz rozmiar flag ( 1/2/3 )");
        System.out.println("1 - large");
        System.out.println("2 - medium");
        System.out.println("3 - small");

        int x = scan.nextInt();
        switch (x){
            case 1:
                printFlag(polishFlag, 1);
                printFlag(japanFlag, 1);
                break;
            case 2:
                printFlag(polishFlag, 2);
                printFlag(japanFlag, 2);
                break;
            case 3:
                printFlag(polishFlag, 3);
                printFlag(japanFlag, 3);
                break;
            default:
                System.out.println("Błędny znak");
        }
    }
}
