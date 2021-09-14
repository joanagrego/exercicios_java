import java.util.Scanner;

public class IR1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor = sc.nextFloat();
        float ir, ir1, ir2, ir3;
        if (0 < valor && valor <= 2000){
            System.out.println("Isento");
        }else if (valor > 2000 && valor <= 3000){
            ir = (valor - 2000);
            ir = ((ir*8)/100);
            System.out.printf("R$ %.2f\n", ir);
        }else if (valor > 3000 && valor < 4500){
            ir = valor - 2000;
            ir1 = ir - 1000;
            ir -= ir1;
            ir = ((ir*8)/100);
            ir1 = ((ir1*18)/100);
            ir2 = ir + ir1;
            System.out.printf("R$ %.2f\n", ir2);
        }else{
            ir = valor - 2000;
            ir1 = ir - 1000;
            ir2 = ir1 - 1500;
            ir -= ir1;
            ir1 -= ir2;
            ir = ((ir * 8) / 100);
            ir1 = ((ir1 * 18) / 100);
            ir2 = ((ir2 * 28) / 100);
            ir3 = ir + ir1 + ir2;
            System.out.printf("R$ %.2f\n", ir3);
        }
    }
}
