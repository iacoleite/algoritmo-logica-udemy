import java.util.Locale;
import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);    
        Scanner sc = new Scanner(System.in);

        int somaIdade, idadeInserida, pessoas;
        Double media = 0.0;
        
        pessoas = 0;
        somaIdade = 0;

        System.out.println("Digite as idades");
        idadeInserida = sc.nextInt();

        while (idadeInserida >= 0) {
        
            somaIdade += idadeInserida;
            pessoas++;    
            idadeInserida = sc.nextInt();
            }        

        if (pessoas == 0) {
            System.out.println("IMPOSSÍVEL CALCULAR");
        } else {
            media = (double)somaIdade / (double)pessoas;
            System.out.printf("Média = %.2f", media);
        }
        
        sc.close();
        
    } 
}

