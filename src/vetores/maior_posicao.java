import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, posicaoMaior;
        double conjunto[], maiorValor;
        

        System.out.print("Quantos números você vai digitar? ");
        quantidade = sc.nextInt();
        conjunto = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um número: ");
            conjunto[i] = sc.nextDouble();
        }
        
        maiorValor = conjunto[0];
        posicaoMaior = 0;

        for (int i = 0; i < quantidade; i++) {
            if (conjunto[i] > maiorValor) {
                maiorValor = conjunto[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("Maior Valor = %.1f\n", maiorValor);
        System.out.printf("Posição do maior valor = %d", posicaoMaior);


        sc.close();
    }
}