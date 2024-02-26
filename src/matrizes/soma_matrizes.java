import java.util.Scanner;

public class soma_matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int linhas = sc.nextInt();
        
        System.out.print("Quantas colunas vai ter cada matriz? ");
        int colunas = sc.nextInt();

        int matrizA[][] = new int[linhas][colunas];
        int matrizB[][] = new int[linhas][colunas];
        int matrizSoma[][] = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizB[i][j] = sc.nextInt();
            }
        }
        // matriz Soma
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz soma: ");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d  ", matrizSoma[i][j]);
            }
            System.out.println();
        }

    sc.close();
    }
}
