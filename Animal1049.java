import java.util.Scanner;

public class Animal1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        String B = sc.nextLine().toLowerCase();
        String C = sc.nextLine().toLowerCase();

        if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
            System.out.print("aguia\n");
        }
        if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
            System.out.print("pomba\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
            System.out.print("homem\n");
        }
        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
            System.out.print("vaca\n");
        }
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
            System.out.print("pulga\n");
        }
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
            System.out.print("lagarta\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
            System.out.print("sanguessuga\n");
        }
        if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
            System.out.print("minhoca\n");
        }
    }
}
