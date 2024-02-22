import java.util.Scanner;
import java.util.Locale;

public class media_ponderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        int casos;
        double media;

        System.out.print("Quantos casos você vai digitar? ");
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) { 
            System.out.println("Digite três números:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("Média = %.1f\n", media);
        }
        sc.close();
    }
}
