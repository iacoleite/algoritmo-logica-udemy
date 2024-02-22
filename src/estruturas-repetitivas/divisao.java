import java.util.Locale;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int casos, numerador, denominador;
        double resultado;

        System.out.print("Quantos casos você vai digitar? ");
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("DIVISÃO IMPOSSÍVEL");
            } else {
                resultado = (double)numerador / (double)denominador;
                System.out.printf("Divisão = %.2f\n", resultado);
            }
        }
        sc.close();
    }
}
