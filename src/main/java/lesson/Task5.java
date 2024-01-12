package lesson;

public class Task5 {
    /**
     * Задача: Поменять местами столбцы с минимальным и максимальным элементами
     */
    public static void main(String[] args) {
        int[][] arr = {
                {9, 2, 4},
                {6, 1, 5},
                {5, 8, 7}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int min = arr[0][0];
        int max = arr[0][0];
        int columnMinNumber = 0;
        int columnMaxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    columnMinNumber = j;
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    columnMaxNumber = j;
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Min column: " + columnMinNumber);
        System.out.println("Max column: " + columnMaxNumber);
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][columnMinNumber];
            arr[i][columnMinNumber] = arr[i][columnMaxNumber];
            arr[i][columnMaxNumber] = a;
        }
        System.out.println("*****");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
