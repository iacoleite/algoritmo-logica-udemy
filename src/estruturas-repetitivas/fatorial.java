import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, resultado;
        resultado = 1;

        do {
        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();
        } while (n > 15 || n < 0);

        if (n == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                resultado = resultado * i;
            }
        }
        System.out.printf("Fatorial = %d\n", resultado);
        sc.close();
    }
}
