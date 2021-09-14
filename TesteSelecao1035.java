import java.util.Scanner;

public class TesteSelecao1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int soma1 = c + d;
        int soma2 = a + b;
        if (b > c && d > a && soma1 > soma2 && a > 0 && b > 0 && c > 0 && d > 0 && a%2 == 0){
            System.out.println("Valores aceitos\n");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
