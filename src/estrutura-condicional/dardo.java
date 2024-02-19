import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiro, segundo, terceiro, maior;

        System.out.print("Primeira distância: ");
        primeiro = sc.nextDouble();
        
        System.out.print("Segunda distância: ");
        segundo = sc.nextDouble();
        
        System.out.print("Terceira distância: ");
        terceiro = sc.nextDouble();
        
        if (primeiro > segundo && primeiro > terceiro) {
            maior = primeiro;
        } else if (segundo > primeiro && segundo > terceiro) {
            maior = segundo;
        } else {
            maior = terceiro;
        }

        sc.close();
        System.out.printf("Maior distância: %.2f", maior);
    }
}


