import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int elementos, conjunto[], soma, numeroPares;
        double media;
        soma = 0;
        numeroPares = 0;
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        elementos = sc.nextInt();

        conjunto = new int[elementos];

        for (int i = 0; i < elementos; i++) {
            System.out.print("Digite um número: ");
            conjunto[i] = sc.nextInt();
        }

        for (int i = 0; i < elementos; i++) {
            if (conjunto[i] % 2 == 0) {
                soma += conjunto[i];
                numeroPares++;
            }
        }

        if (numeroPares != 0){
            media = soma / numeroPares;
            System.out.printf("Média dos pares: %.1f\n", media);
        } else {
            System.out.println("Nenhum número par");
        }
        sc.close();
    }
}
