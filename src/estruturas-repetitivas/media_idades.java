import java.util.Locale;
import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);    
        Scanner sc = new Scanner(System.in);

        int somaIdade, idadeInserida, pessoas, idadeInicial;
        boolean inseriuNegativo = false;
        Double media = 0.0;
        
        pessoas = 1;
        somaIdade = 0;

        System.out.println("Digite as idades");
        idadeInicial = sc.nextInt();

        if (idadeInicial < 0) {
            System.out.println("IMPOSSÍVEL CALCULAR");
        } else {
            somaIdade += idadeInicial;
            do {
                idadeInserida = sc.nextInt();
                if (idadeInserida < 0){
                inseriuNegativo = true;
                } else {
                    pessoas++;
                    somaIdade += idadeInserida;
                    }
                } while (inseriuNegativo == false);
                
        media = (double)somaIdade / (double)pessoas;
        
        System.out.printf("Média = %.2f", media);
        sc.close();
        }
    } 
}

