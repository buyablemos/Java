package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");




        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pojemność plecaka:");
        int capacity= scanner.nextInt();
        System.out.println("Podaj liczbe losowanych elementow:");
        int n= scanner.nextInt();
        System.out.println("Podaj seed:");
        int seed= scanner.nextInt();
        System.out.println("Podaj dolny przedzial losowania:");
        int lower= scanner.nextInt();
        System.out.println("Podaj gorny przedzial losowania:");
        int upper= scanner.nextInt();

       Problem backpack = new Problem(n,seed,lower,upper);
       backpack.Solve(capacity);

       System.out.print(backpack.toString());
    }
}