import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, vetorA[], vetorB[], novoVetor[];
        
        System.out.print("Quantos valores vai ter cada vetor?");
        quantidade = sc.nextInt();

        vetorA = new int[quantidade];
        vetorB = new int[quantidade];
        novoVetor = new int[quantidade];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < quantidade; i++) {
            vetorA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < quantidade; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {
            novoVetor[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor resultante:");
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println(novoVetor[i]);
        }    
    sc.close();
    }
}
