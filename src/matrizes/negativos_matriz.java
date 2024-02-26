import java.util.Scanner;

public class negativos_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int colunas = sc.nextInt();

        int matriz[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Número negativos:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }   
        }
        sc.close();
    }
}
