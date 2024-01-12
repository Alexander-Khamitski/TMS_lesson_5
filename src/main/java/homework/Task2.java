package homework;

public class Task2 {
    /**
     * Задача 2:
     * Создать программу для раскраски шахматной доски с помощью цикла. Создать
     * двумерный массив String 8х8. С помощью циклов задать элементам массива значения
     * B(Black) или W(White). При выводе результат работы программы должен быть следующим:
     * <p>
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     */
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = j % 2 == 0 ? "W" : "B";
                } else {
                    arr[i][j] = j % 2 == 0 ? "B" : "W";
                }
            }
        }
        printArr(arr);
    }

    public static void printArr(String[][] arr) {
        //Print array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
