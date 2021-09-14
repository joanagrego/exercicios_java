import java.util.Scanner;

public class DivisaoXporY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] saida = new String[n];
        int x, y;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (y == 0){
                saida[i] = "divisao impossivel";
            }else{
            double div = (double) x / y;
            saida[i] = String.format("%.1f", div);
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(saida[j]);
        }
    }
}
