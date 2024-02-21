import java.util.Scanner;

public class pares_consecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, soma;
        
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        soma = 0;

        while (numero != 0) {
            if (numero % 2 != 0) {
                numero++;
            } 
            
            soma = 5 * numero + 20;
            System.out.printf("SOMA = %d\n", soma);
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
        }
        sc.close();
    }
}
