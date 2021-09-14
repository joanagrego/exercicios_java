import java.util.Scanner;

public class MediaDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = ((a*2.0) + (b*3.0) + (c*5.0))/10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
