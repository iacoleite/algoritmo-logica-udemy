import java.util.Scanner;
import java.util.Locale;

public class soma_linhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da Matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da Matriz? ");
        int colunas = sc.nextInt();

        double matriz[][] = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++){
            System.out.printf("Digite os elementos da %da. linha\n", i+1);
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double vetor[] = new double[linhas];

        for (int i = 0; i < linhas; i++) {
            double soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        vetor[i] = soma;
        }
        
        System.out.println("Vetor gerado");
        for (int i = 0; i < linhas; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
