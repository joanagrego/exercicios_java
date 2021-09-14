import java.util.Scanner;

public class Triangulo1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a > Math.abs(b - c) && a < b + c) || (b > Math.abs(a - c) && b < a + c) || (c > Math.abs(a - b) && c < a + b)){
            System.out.printf("Perimetro = %.1f\n", a + b + c);
        }else{
            System.out.printf("Area = %.1f\n", ((a+b)*c)/2);
        }
    }
}
