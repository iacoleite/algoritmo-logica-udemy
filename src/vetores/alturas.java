import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, idades[], menoresDeDezesseis;
        double porcentagem, alturaMedia, alturas[], soma;
        String nomes[];

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        
        alturas = new double[n];
        idades = new int[n];
        nomes = new String[n];
        soma = 0;
        menoresDeDezesseis = 0;


        // pega os dados
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            nomes[i] = nome;
            idades[i] = idade;
            alturas[i] = altura;
        }
        
        //soma e calcula média
        for (int i = 0; i < n; i++) {
             soma += alturas[i];
        }
        alturaMedia = soma / n;
        System.out.printf("Altura média: %.2f\n", alturaMedia);

        //identifica pessoas <16, calcula porcentagem, escreve nomes
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menoresDeDezesseis++;
            }
        }
        porcentagem = (menoresDeDezesseis * 100) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
        
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
            System.out.println(nomes[i]);
            }            
        }    
        sc.close();
    }
}
