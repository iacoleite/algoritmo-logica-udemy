import java.util.Scanner;
import java.util.Locale;

public class terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double largura;
        double comprimento;
        double valorMetro;
        

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Digite o valor do m²: ");
        valorMetro = sc.nextDouble();
        sc.nextLine();

        double areaTerreno = largura * comprimento;
        double valorTerreno = areaTerreno * valorMetro;
        sc.close();

        System.out.printf("Area do Terreno = %.2f\n", areaTerreno);
        System.out.printf("Preço do Terreno = %.2f\n", valorTerreno);

    }
}