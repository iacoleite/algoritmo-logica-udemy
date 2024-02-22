import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, conjunto[];
        
        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();
        conjunto = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            conjunto[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");
        
        for (int i = 0; i < n; i++) {
            if (conjunto[i] < 0) {
                System.out.println(conjunto[i]);
            } 
        }
        sc.close();
    }
}
