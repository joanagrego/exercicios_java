import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sell = sc.nextDouble();
        
        double commission = sell*0.15;

        System.out.printf("TOTAL = R$ %.2f\n", commission + salary);
    }
}
