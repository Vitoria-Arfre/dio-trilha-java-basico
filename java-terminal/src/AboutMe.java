import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos comeam com indice 0
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        System.out.println("Ola, me chamo "+ nome + " "+ sobrenome);
        System.out.println("Tenho "+ idade+ " anos ");
        System.out.println("Minha altura é: "+ altura+ " cm");

          

    }
}
