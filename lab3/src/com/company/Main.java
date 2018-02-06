package com.company;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Завдання 1\n");
        int arrey[] = {5, -1, 0, 100, -30, 78, 45, 38, -18, 2, 31};
        System.out.println("Дано масив:");
        System.out.println(Arrays.toString(arrey));
        int k = 0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < 0) k++;
        }
        System.out.println("Кількість від'ємниї чисел:" + k);

        //задание 2
        System.out.print("\nЗавдання 2\nВведіть n: ");
        Random rnd = new Random();
        Scanner scn = new java.util.Scanner(System.in);
        int n = scn.nextInt();
        float[][] array2 = new float[n][n];
        float max = 0.0f, min = 10.0f;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = (float) rnd.nextInt(101) - 50;
                System.out.print(array2[i][j] + "\t");
                    max = Math.max(array2[i][j], max);
                    min = Math.min(array2[i][j], min);

            }
            System.out.println();
        }
        System.out.println("Максимальне число:"+max+"\nМінімальне число:"+min);
    }
}
