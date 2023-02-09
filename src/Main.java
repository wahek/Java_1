
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        calculateSum();
//        calculateF();
//        simpleNumber();
        solution();

    }

    //    Вычислить n-ое треугольного число(сумма чисел от 1 до n)
    static void calculateSum() {
        System.out.println("Введите число для подсчёта суммы чисел от 1 до n. Введите n: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int n = Integer.parseInt(string);
        int sum = 0;
        if (n <= 0) {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    static void calculateF() {
        System.out.println("Вычислить n! (произведение чисел от 1 до n). Введите n: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int n = Integer.parseInt(string);
        int mult = 1;
        if (n <= 0) {
            for (int i = 1; i >= n; i--) {
                mult *= i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                mult *= i;
            }
        }
        System.out.println("Произведение чисел от 1 до " + n + " = " + mult);
    }


    static void simpleNumber() {
        System.out.println("Таблица простых чисел");
        System.out.println(2);
        for (int i = 3; i <= 1000; i++) {
            int count = 0;
            for (int y = 2; y < i; y++) {
                if (i % y == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static double inputFirst() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public static char inputOperation() {
        System.out.println("Введите операцию");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static void solution() {
        double number1 = inputFirst();
        char operation = inputOperation();
        double number2 = inputFirst();
        switch (operation) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                System.out.println("Некорректные данные");
        }
    }
}