import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int elementos; 
        double notas[], soma, media;
        soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        elementos = sc.nextInt();

        notas = new double[elementos];
        

        for (int i = 0; i < elementos; i++) {
            System.out.print("Digite um número: ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < elementos; i++) {
            soma += notas[i];
        }
        media = soma / elementos;
        
        System.out.println();
        System.out.printf("Média do Vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da média:");

        for (int i = 0; i < elementos; i++) {
            if (notas[i] < media) {
                System.out.println(notas[i]);
            }
        }
        sc.close();
    }
}
