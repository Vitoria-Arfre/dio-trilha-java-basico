public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        
        System.out.println(nomeCompleto);

        String concatenação = "?";

        concatenação = 1+1+1+ "1";
        System.out.println(concatenação);

        concatenação = 1+ "1"+1+1;
        System.out.println(concatenação);

        concatenação = 1 +"1"+ 1+"1";
        System.out.println(concatenação);

        concatenação = "1"+1+1+1;
        System.out.println(concatenação);

        concatenação = "1"+ (1+1+1);
        System.out.println(concatenação);

    }
}
