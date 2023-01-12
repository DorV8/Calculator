import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        byte Operation = getOperation();
        double num1 = 0;
        double num2 = 0;
        int num3 = 0;
        switch (Operation) {
            case (1), (2), (3), (4), (7) -> {
                num1 = getValue( (byte) 1);
                num2 = getValue( (byte) 1);
            }
            case (5) -> {
                num1 = getValue( (byte) 1);
                num2 = getValue( (byte) 2);
            }
            case (6), (9) -> num1 = getValue( (byte) 1);
            case (8) -> num3 = getValue();
        }
        String result ="";
        switch (Operation) {
            case (1) -> result = num1 + " + " + num2 + " = " + (num1 + num2);
            case (2) -> result = num1 + " - " + num2 + " = " + (num1 - num2);
            case (3) -> result = num1 + " * " + num2 + " = " + num1 * num2;
            case (4) -> result = num1 + " / " + num2 + " = " + num1 / num2;
            case (5) -> result = num1 + " ^ " + num2 + " = " + Math.pow(num1, num2);
            case (6) -> result = "Квадратный корень числа " + num1 + " = " + Math.sqrt(num1);
            case (7) -> result = "Остаток от деления числа " + num1 + " на " + num2 + " = " + num1 % num2;
            case (8) -> result = "Факториал числа " + num3 + " = " + factorial(num3);
            case (9) -> result = "Логарифм числа " + num1 + " = " + Math.log(num1);
        }
        System.out.println(result);
    }
    public static double getValue(byte choose) {
        Scanner scanner = new Scanner(System.in);
        switch (choose) {
            case (1) -> System.out.println("Введите число: ");
            case (2) -> System.out.println("Введите степень: ");
        }
        return scanner.nextDouble();
    }
    public static int getValue() {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static byte getOperation() {
        System.out.println("Выберите нужную операцию: ");
        System.out.println("""
                1. Сложение
                2. Вычитание
                3. Умножение
                4. Деление
                5. Степень
                6. Квадратный корень
                7. Остаток от деления
                8. Факториал
                9. Логарифм
                """);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }
    public static double factorial (int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}