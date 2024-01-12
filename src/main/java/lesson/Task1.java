package lesson;

import java.util.Random;

public class Task1 {
    /**
     * 1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью класса Random.
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
    }
}
