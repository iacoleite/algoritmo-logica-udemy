import java.util.Scanner;

public class cada_linha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
         int maiores[] = new int[n];

         for (int i = 0; i < n; i++) {
            int maiorLinha = matriz[0][0];
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maiorLinha) {
                    maiorLinha = matriz[i][j];
                }
            }
            maiores[i] = maiorLinha;
        }
        
        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < maiores.length; i++) {
            System.out.println(maiores[i]);
        }
        sc.close();
    }
}
