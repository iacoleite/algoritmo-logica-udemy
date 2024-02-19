import java.util.Scanner;
import java.util.Locale;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double preco1, preco2, preco3, preco4, preco5, total;
        int quantidade, codigoProduto;
        preco1 = 5;
        preco2 = 3.5;
        preco3 = 4.8;
        preco4 = 8.9;
        preco5 = 7.32;

        System.out.print("Código do produto comprado: ");
        codigoProduto = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        
        if (codigoProduto == 1) {
            total = preco1 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", total);
        } else if (codigoProduto == 2) {
            total = preco2 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", total);
        } else if (codigoProduto == 3) {
            total = preco3 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", total);
        } else if (codigoProduto == 4) {
            total = preco4 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", total);
        } else {
            total = preco5 * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f", total);
        }
        sc.close();
    }
}
