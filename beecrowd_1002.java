import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double raio = Sc.nextDouble();
        double area = 3.14159 * (Math.pow(raio, 2));
        System.out.printf("A=%.4f\n", area);
    }
}
