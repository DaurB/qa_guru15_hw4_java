package quru.qa;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        double c = 1.5;
        // Математические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a * c = " + (a * c));
        System.out.println("c / b = " + (c / b));
        System.out.println("c + b = " + (c + b));
        System.out.println("a - c = " + (a - c));

        // Логические операторы
        if (a > b && a > c) {
            System.out.println("Значение a больше чем значение b и c");
        } else if (c > a && c > b) {
            System.out.println("Значение c больше чем значение a и c");
        } else {
            System.out.println("Значение b больше чем значение a и c");
        }

    }
}
