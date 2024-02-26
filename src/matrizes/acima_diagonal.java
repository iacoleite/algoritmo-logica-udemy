import java.util.Scanner;


public class acima_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ordemMatriz, soma;
        soma = 0;
        
        System.out.print("Qual a ordem da matriz? ");
        ordemMatriz = sc.nextInt();

        int matriz[][] = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos acima da diagonal principal: " + soma);
        sc.close();

    }
}
