import java.util.Locale;
import java.util.Scanner;

public class menorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int primeiro, segundo, terceiro, menor, menorDeDois;

        System.out.print("Primeiro valor: ");
        primeiro = sc.nextInt();
        System.out.print("Segundo valor: ");
        segundo = sc.nextInt();
        System.out.print("Terceiro valor: ");
        terceiro = sc.nextInt();

        menor = primeiro;
        
        if (segundo < terceiro) {
            menorDeDois = segundo;
        } else {
            menorDeDois = terceiro;
        }
        
        if (menor > menorDeDois) {
            menor = menorDeDois;
        }
        
        sc.close();
        System.out.printf("Menor de três: %d", menor);
    }
}
