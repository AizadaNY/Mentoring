package udemyLearningCode.arrays;

import java.util.Scanner;

public class ArrayProject {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of days ");
        int numberOfDays = scanner.nextInt();
        int sum = 0;
        double avrTemp = 0;

        int[] temps = new int[numberOfDays];


        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i + 1) + " Temperature is");

            temps[i] = scanner.nextInt();

            sum += temps[i];
        }

        avrTemp = sum / numberOfDays;
        System.out.println("Average temperature is " + avrTemp);

        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avrTemp) {
                count++;
            }
        }
        System.out.println("The days above avr temperature is " + count);
    }
}


















