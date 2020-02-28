/*
Daily needs of calories on a base of Harris-Benedict equation
Patryk Klimek
 */

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją masę w kilogramach: ");
        int weight = scanner.nextInt();
        System.out.println("Podaj swój wzrost w centymetrach: ");
        int height = scanner.nextInt();
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj swoją płeć (1. mężczyzna, 2. kobieta) ");
        int sex = scanner.nextInt();
        double HBFemale;
        double HBMale;
        if (sex == 1){
            HBMale = 66.47 + (13.7*weight) + (5.0*height) - (6.76*age);
            System.out.println(HBMale);
        }
        else if (sex == 2){
            HBFemale = 655.1 + (9.567*weight) + (1.85*height) - (4.68*age);
            System.out.println(HBFemale);
        }
        else {
            System.out.println("Nieprawidłowo podałeś płeć.");
        }

    }

}
