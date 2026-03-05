package se.lexicon;

import jdk.jfr.Percentage;

import java.awt.*;
import java.sql.Time;
import java.util.Scanner;




public class BookStageConverterApp {
    private static String Letter;

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Convert App ===");
            System.out.println("Please Enter Your Choice");
            System.out.println("1.Time Converter");
            System.out.println("2.Speed Converter");
            System.out.println("3.Grade Converter");
            System.out.println("4.Fuel Consumption Converter");
            System.out.println("5.End");

            int choice = scanner.nextInt();
            switch (choice) {

                case 1: // Time Converter
                    System.out.println("Choose conversion:" + "1.Enter Minutes" + "2.Enter Houre");

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
                    System.out.println("choose conversion:" + "1.km/h → ms" + "2.ms → km/h");
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
                    break;

                case 3: // Grade Converter
                    System.out.println("choose conversion:" + "( Percentage→Letter == 1.)" + "(Letter → Percentage==2)");
                    int Gradechoice = scanner.nextInt();
                    //percentage → letter
                    if (Gradechoice == 1.) {
                        System.out.println("Enter Grade percentage → Letter(0-100) :");
                        Double percentage = scanner.nextDouble();
                        String grade;
                        if (percentage >= 100) {
                            grade = "A";
                        } else if (percentage >= 85) {
                            grade = "B";
                        } else if (percentage >= 70) {
                            grade = "C";
                        } else if (percentage >= 55) {
                            grade = "D";
                        } else {
                            grade = "F";
                        }
                        System.out.println("Letter Grade :" + grade);
                    }//letter →  percentage
                    else if (Gradechoice == 2) {
                        System.out.println("Enter Letter Grade(A-F) : ");
                        double letter = scanner.nextDouble();
                        String grade;
                        switch (Letter) {
                            case "A":
                                System.out.println("90–100%");
                            case "B":
                                System.out.println("80–89%");
                            case "C":
                                System.out.println("70–79%");
                            case "D":
                                System.out.println("60–69%");
                            case "F":
                                System.out.println("0–59%");
                                System.out.println("Invalid Grade choice");
                                break;



                    }

            }


                case 4: // fuel consumption Converter
                    System.out.println("Choose your conversion:" + "1.L/100km → km/L" + "2.km/l → L/100km");
                    double FuelChoice = scanner.nextDouble();
                    String fuel;
                    if (FuelChoice == 1) {
                        System.out.println("Enter fuel consumption in L/100km:");
                        double lPer100km = scanner.nextDouble();

                        double kmPerL = 100 / lPer100km;

                        System.out.println("Fuel consumption in km/L: " + kmPerL);

                    } else if (FuelChoice == 2) {
                        System.out.println("Enter fuel consumption in km/L:");
                        double kmPerL = scanner.nextDouble();

                        double lPer100km = 100 / kmPerL;

                        System.out.println("Fuel consumption in L/100km: " + lPer100km);

                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;


            }   }

    }
}


