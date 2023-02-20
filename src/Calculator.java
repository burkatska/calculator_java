import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Введіть 1 число: ");
       float num1 = scanner.nextFloat();

        System.out.print("Введіть 2 число: ");
        float num2 = scanner.nextFloat();

        System.out.print("Дія: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        float result;

        switch (action) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат:");
                System.out.print(num1 + " " + action + " " + num2 + " =" + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Результат:");
                System.out.print(num1 + " " + action + " " + num2 + " =" + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Результат:");
                System.out.print(num1 + " " + action + " " + num2 + " =" + result);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Помилка: на 0 ділити не можна");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат:");
                    System.out.print(num1 + " " + action + " " + num2 + " =" + result);
                }
        }

    }

}






