import java.util.Scanner;

public class soma_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, soma;
        System.out.println("Digite dois números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        soma = 0;

        if (a > b){
            c = a;
            a = b;
            b = c;
        }    
        
        
        for (int i=a+1;i<b;i++){
            if (i % 2 != 0){
                soma += i;
            }
        }
        System.out.printf("Soma = %d\n", soma);
        sc.close();
    }
}
