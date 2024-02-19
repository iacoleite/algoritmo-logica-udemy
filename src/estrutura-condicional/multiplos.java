import java.util.Locale;
import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, divisor, dividendo;
        
        System.out.println("Digite dois números inteiro: ");
        System.out.print("Número 1: ");
        numero1 = sc.nextInt();
        System.out.print("Número 2: ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            dividendo = numero1;
            divisor = numero2;
        } else {
            dividendo = numero2;
            divisor = numero1;
        }
        if ((dividendo % divisor) == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
