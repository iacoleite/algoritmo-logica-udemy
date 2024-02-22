import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, x;
        

        System.out.print("Quantos números você vai digitar? ");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            x = sc.nextInt();
            if (x == 0) {
                System.out.println("NULO");
            } else {
                    if (x % 2 == 0){
                    System.out.print("Par ");
                    } else {
                    System.out.print("Ímpar ");
                    }
            
                if (x < 0){
                    System.out.println("negativo");
                    } else {
                    System.out.println("positivo");
                    }
            }
        }
        sc.close();
    }
}