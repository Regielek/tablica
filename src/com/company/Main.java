package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] multipleResults = new int[10];
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        number = scanner.nextInt();

        for (int y = 1; y <= 10; y++)
        {
            multipleResults[y - 1] = number * y;
        }

        for (int board : multipleResults)
        {
            System.out.println(board);
        }
    }
}
