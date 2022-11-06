import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os minutos gastos");
        int minutos = scanner.nextInt();
        double conta = 50;
        if (minutos>100){
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor a pagar: %.2f%n", conta);

        scanner.close();
    }
}