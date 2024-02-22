import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, numero, dentro, fora;
        dentro = 0;
        fora = 0; 

        System.out.print("Quantos números você vai digitar? ");
        quantidade = sc.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número? ");
            numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.printf("%d DENTRO\n", dentro);
        System.out.printf("%d FORA\n", fora);
        sc.close();
    }
}
