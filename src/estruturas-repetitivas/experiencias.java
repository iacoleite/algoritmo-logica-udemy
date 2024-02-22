import java.util.Locale;
import java.util.Scanner;

public class experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int testes, cobaias, ratos, coelhos, sapos;
        double pcCoelhos, pcRatos, pcSapos;
        char tipo;

        tipo = ' ';
        coelhos = 0;
        ratos = 0;
        sapos = 0;
        cobaias = 0;

        System.out.print("Quantos casos de testes serão digitados? ");
        testes = sc.nextInt();

        for (int i = 0; i < testes; i++) {
            System.out.print("Quantidade de cobaias: ");
            int cobaiasTeste = sc.nextInt();

            do { 
                System.out.print("Tipo de Cobaia: ");
                tipo = sc.next().charAt(0);
            } while (!(tipo == 'C' || tipo == 'R' || tipo == 'S'));
            
            if (tipo == 'C') {
                coelhos += cobaiasTeste;
            } else if (tipo == 'R') {
                ratos += cobaiasTeste;
            } else {
                sapos += cobaiasTeste;
            }

            cobaias += cobaiasTeste;
        }

        pcCoelhos = ((double)coelhos * 100) / (double)cobaias;
        pcRatos = ((double)ratos * 100) / (double)cobaias;
        pcSapos = ((double)sapos * 100) / (double)cobaias;

        System.out.println("Relatório Final:");
        System.out.printf("Total: %d cobaias\n", cobaias);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", pcCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", pcRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", pcSapos);
        sc.close();

    }
}
