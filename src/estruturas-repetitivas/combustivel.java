import java.util.Scanner;
import java.util.Locale;

public class combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, entrada;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        entrada = 0;

        while (entrada != 4) {
            System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
            entrada = sc.nextInt();
            
            if (entrada == 1) {
                alcool++;
            } else if (entrada == 2) {
                gasolina++;
            } else if (entrada == 3) {
                diesel++;
            }
            
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
        sc.close();
    }   
}
