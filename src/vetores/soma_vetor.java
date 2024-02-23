import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media, conjunto[];
        soma = 0;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();
        conjunto = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            conjunto[i] = sc.nextDouble();
            soma += conjunto[i];
        }

        System.out.println();
        media = soma / n;
        System.out.print("Valores =");
        for (int i = 0; i < n; i++) {
            System.out.printf("  %.1f", conjunto[i]);
        }
        System.out.println();
        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);
        sc.close();

        
    }
}
