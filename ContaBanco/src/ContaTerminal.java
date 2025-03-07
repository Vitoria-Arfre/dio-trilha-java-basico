import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // se for pela IDE
        System.out.println("Por favor, informe o seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o nome da agência:");
        String nomeAgencia = scanner.next();
 
        System.out.println("Por favor, digite o número da Agência: "); 
        int numero = scanner.nextInt();

        System.out.println("Por favor, insira o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + " , obrigado por criar uma conta em nosso banco. Sua agência é a "+ nomeAgencia);
        System.out.println("Conta: "+ numero +" e seu saldo R$: "+ saldo + " já está disponivel para saque!");


       
    }
}