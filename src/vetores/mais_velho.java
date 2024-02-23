import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas, idades[], maisVelho, maiorIdade;
        String nomes[];
        

        System.out.print("Quantas pessoas você vai digitar? ");
        pessoas = sc.nextInt();

        idades = new int[pessoas];
        nomes = new String[pessoas];

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        
        maisVelho = 0;
        maiorIdade = idades[0];
        
        for (int i = 0; i < pessoas; i++) {
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                maisVelho = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s\n", nomes[maisVelho]);
        sc.close();
    }
}
