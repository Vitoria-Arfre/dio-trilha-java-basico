public class ExemploBreakContinue {

    public static void main(String[] args) {
            for(int numero = 1; numero <=5; numero++){
                if(numero == 3)
                    //continue; // quando quiser que contiue a iteração e só "passe" pelo 3 sem imprimi-lo.
                    break; //  quando quiser que interrompa no 3 e pare a iteração
                    System.out.println(numero);
                }
    }
}   