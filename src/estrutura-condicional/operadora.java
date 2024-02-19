import java.util.Scanner;
import java.util.Locale;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int minutos, adicional;
        double valor = 50;
        
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();
        
        if (minutos <= 100) {
            System.out.printf("Valor a pagar = R$ %.2f", valor);
        } else {
            adicional = (minutos - 100) * 2;
            valor += adicional;
            System.out.printf("Valor a pagar = R$ %.2f", valor);
        }
        sc.close();
    }
}
