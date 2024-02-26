import java.util.Scanner;

public class diagonal_negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.printf("%d  ", matriz[i][j]);
                }
            }
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }
        System.out.printf("Quantidade de negativos = %d", negativos);    

        sc.close();

    }

}
