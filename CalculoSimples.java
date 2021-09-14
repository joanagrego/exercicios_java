import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1 = sc.nextInt();
        int qnt1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int qnt2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (qnt1*valor1) + (qnt2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
