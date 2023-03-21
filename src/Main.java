import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void Base() {
        System.out.print("Введите амплитуду колебания: "); double a = in.nextDouble();
        int T = 2; double m = 0.2;
        double W = (2 * Math.pow(Math.PI, 2) * Math.pow(a, 2) * m) / Math.pow(T, 2);
        System.out.println("Энергия материальной точки: " + W);
    }

    public static void Medium() {
        final int m = 2;
        final double x = 1.1;
        double y = Math.sin((Math.sqrt(Math.abs(x))) + Math.pow(Math.tan(Math.pow(x, 4) + Math.pow(m, 2)), 3));
        System.out.println("Функция Y: " + y);
    }

    public static void Hard() {
        double C = Math.pow(10, -6);
        double L = 0.04;
        int U = 100;
        double I = U * Math.sqrt(C / L);
        double W = (L * Math.pow(I, 2) / 2);
        System.out.println("Амплитуда силы тока: " + I + " A");
        System.out.println("Полная энергия: " + W + " Дж");
    }
    public static void main(String[] args) {
        Base();
        Medium();
        Hard();
    }
}