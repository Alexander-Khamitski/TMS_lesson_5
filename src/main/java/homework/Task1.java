package homework;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /**
     * Задача 1:
     * 1.1 Создать двумерный массив, заполнить его случайными числами.
     * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
     * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
     */
    public static void main(String[] args) {
        //1.1
        System.out.println("Enter number of rows: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int numberOfColumns = scanner.nextInt();
        int[][] arr = new int[numberOfRows][numberOfColumns];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        printArr(arr);
        //1.2
        System.out.println("Enter number for increasing: ");
        int add = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += add;
            }
        }
        printArr(arr);
        //1.3
        int sumOfAllElements = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumOfAllElements += arr[i][j];
            }
        }
        System.out.println("Sum of all elements is: " + sumOfAllElements);
    }

    public static void printArr(int[][] arr) {
        //Print array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
