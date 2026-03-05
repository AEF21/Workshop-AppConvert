package se.lexicon;
/*
Curent workshop describing  application that will convert users book-reading activity
 based on past,now,future.
 */

import java.sql.Time;
import java.util.Scanner;




public class BookStageConverterApp {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Convert App ===");
            System.out.println("Please Enter Your Choise");
            System.out.println("1.Time Converter");
            System.out.println("2.Speed Converter");
            System.out.println("3.Grad Converter");
            System.out.println("4.BMI Calculator");
            System.out.println("5.End");

            int choise = scanner.nextInt();
            switch (choise) {

                case 1: // Time Converter
                    System.out.println("Choose conversion:");

                    int timeChoice = scanner.nextInt();

                    if (timeChoice == 1) {
                        System.out.println("Enter minutes:");
                        double minutes = scanner.nextDouble();
                        double hours = minutes / 60;
                        System.out.println(minutes + " minutes = " + hours + " hours");
                    } else if (timeChoice == 2) {

                        System.out.println("Enter hours:");
                        double hours = scanner.nextDouble();
                        double minutes = hours * 60;
                        System.out.println(hours + " hours = " + minutes + " minutes");
                    } else {
                        System.out.println("Invalid time choice");
                    }
                    break;

                case 2: // Speed Converter
                    System.out.println("choose conversion:");
                    int speedchoice = scanner.nextInt();

                    if (speedchoice == 1) {
                        System.out.println("Enter speed in km/h:");
                        double kmh = scanner.nextDouble();
                        double ms = kmh / 3.6;
                        System.out.println(kmh + "km/h =" + ms + "m/s");
                    } else if (speedchoice == 2) {
                        System.out.println("Enter speed in m/s:");
                        double ms = scanner.nextDouble();
                        double kmh = ms * 3.6;
                        System.out.println(ms + "m/s = " + kmh + "km/h");

                    } else {
                        System.out.println("Invalid speed choice");
                    }
            }      break;
        }
    }

}