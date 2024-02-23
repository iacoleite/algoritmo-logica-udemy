import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas, numeros[], pares;

        System.out.print("Quantos números você vai digitar? ");
        pessoas = sc.nextInt();

        numeros = new int[pessoas];
        pares = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números pares");
        for (int i = 0; i < pessoas; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + "  ");
                pares++;
            }
        }

        System.out.println();
        System.out.printf("Quantidade de pares = %d\n", pares);
        
    sc.close();
    }
}
