import java.util.Locale;
import java.util.Scanner;

public class comerciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeProdutos, lucroBaixo, lucroMedio, lucroAlto;
        double valorCompra, valorVenda, lucro;
        System.out.print("Serão digitados dados de quantos produtos? ");
        quantidadeProdutos = sc.nextInt();
        
        lucroAlto = 0;
        lucroBaixo = 0;
        lucroMedio = 0;
        valorCompra = 0;
        valorVenda = 0;

        String[] produtos = new String[quantidadeProdutos];
        double[] compra = new double[quantidadeProdutos];
        double[] venda = new double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.printf("Produto %d:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            produtos[i] = sc.nextLine();
            System.out.print("Preço de compra: ");
            compra[i] = sc.nextDouble();
            System.out.print("Preço de venda: ");
            venda[i] = sc.nextDouble();
        }

        System.out.println("Relatório:");

        double porcentagemLucros[] = new double[quantidadeProdutos];
        for (int i = 0; i < quantidadeProdutos; i++) {
            double lucroProduto = venda[i] - compra[i];
            porcentagemLucros[i] = lucroProduto / compra[i] * 100.0;
        }    
        for (int i = 0; i < quantidadeProdutos; i++) { 
            if (porcentagemLucros[i] < 10.0) {
                    lucroBaixo++;
                } else if (porcentagemLucros[i] > 20.0) {
                    lucroAlto++;
                } else {
                    lucroMedio++;
                }
        }

        System.out.printf("Lucro abaixo de 10%%: %d\n", lucroBaixo);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", lucroMedio);
        System.out.printf("Lucro acima de 20%%: %d\n", lucroAlto);

        for (int i =0; i < quantidadeProdutos; i++) {
            valorCompra += compra[i];
            valorVenda += venda[i];
        }
        System.out.printf("Valor total de compra: %.2f\n", valorCompra);
        System.out.printf("Valor total de venda: %.2f\n", valorVenda);

        lucro = valorVenda - valorCompra;

        System.out.printf("Lucro total: %.2f\n", lucro);
        sc.close();
    }
}
