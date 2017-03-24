package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Assignment: Introductory programming exercises ");
        System.out.println("** Triangle Exercises");
        System.out.println("1) Print one asterisk");
        System.out.println("2) Draw a horizontal line");
        System.out.println("3) Draw a vertical line");
        System.out.println("4) Draw a right triangle");

        System.out.println("Exit = 0");

        processInputs();

    }

    private static void processInputs(){
        while(true) {

            System.out.println("Choose an option:");

            Scanner s = new Scanner(System.in);
            int option = Integer.parseInt(s.nextLine());

            if(option == 0){ break; }

            if (option == 1) {
                printAsterisk();
                System.out.println();
            }
            else if (option == 2 || option == 3 || option == 4) {
                System.out.println("Insira o tamanho do objeto desejado:");
                int n = Integer.parseInt(s.nextLine());

                if (option == 2) {
                    printHorizontalLine(n);
                } else if (option == 3) {
                    printVerticalLine(n);
                } else if (option == 4) {
                    printRightTriangle(n);
                }
            }
        }
    }

    private static void printRightTriangle(int n) {
        for(int i = 0; i < n; i++){
            printHorizontalLine(i + 1);
        }
    }

    private static void printVerticalLine(int n) {
        for(int i = 0; i < n; i++){
            printAsterisk();
            System.out.println();
        }
    }

    private static void printHorizontalLine(int n) {

        for(int i = 0; i < n; i++){
            printAsterisk();
        }
        System.out.println();

    }

    private static void printAsterisk() {
        System.out.print("*");
    }
}
