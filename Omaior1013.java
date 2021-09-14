import java.util.Scanner;

public class Omaior1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b))/2;

        if (c > maiorAB){
            System.out.println(c + " eh o maior\n");
        }else{
            System.out.println(maiorAB + " eh o maior\n");
        }
    }
}
