import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class matriz_geral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int ordem = sc.nextInt();

        double matriz[][] = new double[ordem][ordem];
        double matrizAlterada[][] = new double[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++){
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println();

        double somaPositivos = 0;
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++){
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }

        System.out.printf("Soma dos positivos: %.1f\n", somaPositivos);
        System.out.println();

        System.out.print("Escolha uma linha: ");
        int linhaEscolhida = sc.nextInt();
        System.out.print("Linha escolhida: ");
        for (int i = 0; i < ordem; i++){
            System.out.printf("%.1f ", matriz[linhaEscolhida][i]);
        }
        System.out.println();
        System.out.println();    
        
        System.out.print("Escolha uma coluna: ");
        int colunaEscolhida = sc.nextInt();
        System.out.print("Coluna escolhida: ");
        for (int i = 0; i < ordem; i++){
            System.out.printf("%.1f ", matriz[i][colunaEscolhida]);
        }
        System.out.println();
        System.out.println();

        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++){
                if (i == j) {
                    System.out.printf("%.1f ", matriz[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Matriz alterada:");
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++){
                if (matriz[i][j] < 0){
                    matrizAlterada[i][j] = Math.pow(matriz[i][j], 2);
                } else {
                    matrizAlterada[i][j] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++){
                System.err.printf("%.1f  ", matrizAlterada[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
