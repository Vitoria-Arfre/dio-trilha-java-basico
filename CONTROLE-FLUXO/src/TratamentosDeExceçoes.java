import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TratamentosDeExceçoes {
 public static void main(String[] args) {
    try{//permite que vc define um bloco de codigo para ser testado quanto a erros enquanto está sendo executado
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Digite sua idade: ");
    double altura = scanner.nextDouble();


    System.out.println("Olá, me chamo "+nome.toUpperCase() + " "+ sobrenome);
    System.out.println("Tenho "+ idade+ " anos ");
    System.out.println("Minha altura é "+ altura+ " cm");
    scanner.close();
    
    }
    catch(InputMismatchException e) {//caso ocorra um erro no try
        System.err.println("Os campos idade e altura precisam ser númericos!");
    }



 }   
}
