import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double preco, total, dinheiroRecebido, troco;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();
        sc.close();
        
        total = preco * quantidade;
        troco = dinheiroRecebido - total;

        System.out.printf("Troco = %.2f", troco);

    }
}
