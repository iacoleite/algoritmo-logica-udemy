import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double preco, recebido, troco, total, falta;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        
        System.out.print("Dinheiro recebido: ");
        recebido = sc.nextDouble();

        sc.close();

        total = preco * quantidade;
        if (recebido < total) {
            falta = total - recebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f", falta);
        } else {
            troco = recebido - total;
            System.out.printf("TROCO = R$ %.2f", troco);
        }
    }
}
