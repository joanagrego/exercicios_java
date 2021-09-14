import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hours = sc.nextInt();
        double money = sc.nextDouble();

        double salary = hours*money;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
