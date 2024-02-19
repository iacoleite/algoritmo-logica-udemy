import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double distancia, combustivel, consumo;
        
        System.out.print("Distância percorrida: ");
        distancia = sc.nextDouble();
        System.out.print("Combustível gasto: ");
        combustivel = sc.nextDouble();
        sc.close();
        consumo = distancia / combustivel;

        System.out.printf("Consumo médio = %.3f", consumo);
        
    }
}
