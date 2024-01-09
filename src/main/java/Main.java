import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("На сколько людей необходимо разделить счет?");
        int users = getInput();
        calculate();
        cheque(users);

    }




    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int users;
        while (true) {
            if (scanner.hasNextInt()) {
                users = scanner.nextInt();
                if (users == 1) {
                    System.out.println("Делить нечего");
                    break;
                }
                if (users <= 1) {
                    System.out.println("Ошибка, введите число повторно");
                    scanner.nextLine();
                }
                if (users > 1) {
                    System.out.println("Делим счет на " + users);
                    break;
                }
            }
            else {
            System.out.println("Введите корректное число");
            scanner.nextLine();}
        }
        return users;
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("Введите название товара или 'Завершить' для завершения работы калькулятора");
            String productName = scanner.nextLine();
            if (productName.equalsIgnoreCase("Завершить")) {
                break;
            }
            while (true) {
                System.out.println("Введите стоимость товара");
                if (scanner.hasNextDouble()) {
                    double productPrice = scanner.nextDouble();
                    if (productPrice > 0) {
                        System.out.println("Товар успешно добавлен в калькулятор.");
                        scanner.nextLine();
                        Items items = new Items(productPrice, productName);
                        calculator.productsSum(items);
                        calculator.addNewProducts(items);
                        break;
                    } else {
                        System.out.println("Некорректный ввод"); // ввод отрицательного числа
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Некорректный ввод,введите числовое значение "); // ввод нечислового значения
                    scanner.nextLine();
                }
            }
        }
        }

    public static void cheque(int users) {
        Calculator calculator = new Calculator();
        Payment payment = new Payment(calculator.chequePerPerson(),users);
        payment.paymentPerPerson();

    }


}
