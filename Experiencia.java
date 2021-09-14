import java.util.Scanner;

public class Experiencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int qnt = 0;
        int ratos = 0, coelhos = 0, sapos = 0, total = 0;
        String cobaia = " ";
        for (int i = 0; i < n; i++) {
            qnt = sc.nextInt();
            cobaia = sc.nextLine();
            total += qnt;

        }
    
        if(cobaia.equals("C")){
            coelhos += qnt;
        }else if(cobaia.equals("R")){
            ratos += qnt;
        }else if(cobaia.equals("S")){
            sapos += qnt;
        }

        double percentual_c = ((coelhos * 100.00) / total);
		double percentual_r = ((ratos * 100.00) / total);
		double percentual_s = ((sapos * 100.00) / total);

        System.out.println("Total: " + total + " cobaias\n");
        System.out.println("Total de coelhos: " + coelhos + "\n");
        System.out.println("Total de ratos: " + ratos + "\n");
        System.out.println("Total de sapos: " + sapos + "\n");

        System.out.printf("Percentual de coelhos: %.2f\n", percentual_c);
        System.out.printf("Percentual de ratos: %.2f\n", percentual_r);
        System.out.printf("Percentual de sapos: %.2f\n", percentual_s);

    }
}
