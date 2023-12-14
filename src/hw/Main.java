package hw;

import java.util.Scanner;

public class Main {
        static double num1;
        static double num2;
        static double resaultB;
        static double resaultA;

        public static void main(String[] args) {

            inNumber();
            getResault();
            getOutput();
        }
        private static void inNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = scanner.nextDouble();
        }
        private static void getResault() {
            DeviceA deviceA = new DeviceA();
            resaultA = deviceA.calcResault(num1, num2);
            DeviceB deviceB = new DeviceB();
            resaultB = deviceB.calcResault(num1, num2);
        }

        private static void getOutput() {
            System.out.printf("Devaise A is: %.2f%n", resaultA);
            System.out.printf("Devaise B is: %.2f%n", resaultB);
        }
    }