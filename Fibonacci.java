import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int numero = scanner.nextInt();
        int a = 0;
        int b = 1;
        int soma;
        
        if (numero == 0 || numero == 1) {
            System.out.println("O numero pertence a sequencia de Fibonacci.");
            return;
        }
        
        while (true) {
            soma = a + b;
            if (soma > numero) {
                System.out.println("O numero nao pertence a sequencia de Fibonacci.");
                break;
            }
            else if (soma == numero) {
                System.out.println("O numero pertence a sequencia de Fibonacci.");
                break;
            }
            a = b;
            b = soma;
        }
        scanner.close();
    }
}
