import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк треугольника = ");
        int rows = scanner.nextInt();

        //Заполненный треугольник
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Пустой треугольник
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == rows || k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

