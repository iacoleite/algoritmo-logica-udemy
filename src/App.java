// SHIFT + ALT + O -> auto import
import java.util.Locale; // importa biblioteca local
import java.util.Scanner; // importa o scanner pra pegar input

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);  // coloca o local como US (transforma , em . nos float)
        Scanner sc = new Scanner(System.in);
        
        int x, soma;
        soma = 0;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();
        
        while (x != 0) {
            soma = soma + x;
            System.out.print("Digite outro numero: ");
            x = sc.nextInt();
        }
            System.out.println("SOMA = " + soma);
            sc.close();
    }
}

