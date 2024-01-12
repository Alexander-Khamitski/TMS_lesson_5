package lesson;

public class Task6 {
    /**
     * Задача *: Даны числа n и m.
     * Создайте массив A[n][m] и заполните его змейкой (см. пример).
     * Формат входных данных: Программа получает на вход два числа n и m.
     * Формат выходных данных: Программа должна вывести полученный массив,
     * отводя на вывод каждого числа ровно 3 символа.
     * Пример
     * Ввод: 4 6
     * Вывод:
     * 0 1 2 3 4 5
     * 11 10 9 8 7 6
     * 12 13 14 15 16 17
     * 23 22 21 20 19 18
     */
    public static void main(String[] args) {
        int[][] arr = new int[4][6];
        int digit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = digit;
                    digit += 1;
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0 ; j--) {
                    arr[i][j] = digit;
                    digit += 1;
                }
            }
        }
        //Print array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
