package lesson;

import java.util.Random;

public class Task3 {
    /**
     * Задача 3: Найдите сумму элементов на главной диагонали
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int mainDioSum = 0;
        for (int i = 0; i < arr.length; i++) {
            mainDioSum += arr[i][i];
        }
        System.out.println("Main dio sum is: " + mainDioSum);
    }
}
