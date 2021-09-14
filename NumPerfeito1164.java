import java.util.Scanner;
// ESTUDAR MELHOR
public class NumPerfeito1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, soma;
        String[] saida = new String[n];

        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            soma = 0;
            for (int j = 1; j < x; j++) {
                if (x%j == 0){
                    soma += j;
                }
            }
            if (soma == x){
                saida[i - 1] = x + " eh perfeito";
            }else{
                saida[i - 1] = x + " nao eh perfeito";
            }  
        }
        for (int z = 0; z < n; z++) {
            System.out.println(saida[z]);
        } 
    }
}
