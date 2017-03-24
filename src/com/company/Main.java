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

        while(true) {

            System.out.println("Choose an option:");

            Scanner s = new Scanner(System.in);
            int option = Integer.parseInt(s.nextLine());

            if(option == 0){ break; }

            if (option == 1) {
                PrintAsterisk();
            }
            else if (option == 2 || option == 3 || option == 4) {
                System.out.println("Insira o tamanho do objeto desejado:");
                int n = Integer.parseInt(s.nextLine());

                if (option == 2) {
                    PrintHorizontalLine(n);
                } else if (option == 3) {
                    PrintVerticalLine(n);
                } else if (option == 4) {
                    PrintRightTriangle(n);
                }
            }
        }

    }

    private static void PrintRightTriangle(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PrintVerticalLine(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    private static void PrintHorizontalLine(int n) {

        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();

    }

    private static void PrintAsterisk() {
        System.out.println("*");
    }
}
