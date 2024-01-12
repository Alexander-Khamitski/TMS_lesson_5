package lesson;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /**
     * Задача 4: Найдите сумму элементов на побочной диагонали
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("*****");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sideDioSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sideDioSum += arr[i][arr.length - 1 - i];
        }
        System.out.println("Side dio sum is: " + sideDioSum);
        //0,2 - 1,1 - 2,0
    }
}
