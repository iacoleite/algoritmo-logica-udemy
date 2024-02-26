import java.util.Scanner;

public class teste_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas, colunas;
        
        System.out.print("Quantas linhas vai ter a matriz? ");
        linhas = sc.nextInt();
        System.out.print("Quantas colunas vai ter a matriz? ");
        colunas = sc.nextInt();

        int matriz[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz digitada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
        System.out.println();
        }
        sc.close();
    }
}
