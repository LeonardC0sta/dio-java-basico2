import java.util.Locale;
import java.util.Scanner;


public class desafio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("seu nome:");
        String nome = scanner.next();

        System.out.println("digite o número da sua agência:");
        int numeroAgencia = scanner.nextInt();

        System.out.println("digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        int saldo = 23748;
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", sua conta é: " + numeroConta + "e seu saldo de " + saldo + " já está disponível para saque");





    }
    
}
