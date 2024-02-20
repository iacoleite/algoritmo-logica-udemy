import java.util.Scanner;
import java.util.Locale;

public class temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char escala;
        double temperaturaC, temperaturaF;
        
        System.out.print("Você vai digitar a temperatura em qual escala [(C)elsius ou (F)ahrenheit]? ");
        escala = sc.nextLine().charAt(0);
        
        if (escala == 'F' ) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperaturaF = sc.nextDouble();
            temperaturaC = (temperaturaF - 32) * ((double)5 / (double)9);
            System.out.printf("Temperatura equivalente em Celsius: %.2f", temperaturaC);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaC = sc.nextDouble();
            temperaturaF = (temperaturaC * ((double)9 / (double)5)) + 32;   
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperaturaF);
        }
       sc.close();
    }
}
