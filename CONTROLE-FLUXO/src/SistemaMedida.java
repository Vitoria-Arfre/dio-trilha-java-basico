public class SistemaMedida {

    public static void main(String[] args) {
        String sigla = "A";
        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
            }   break;
            case "G":{
                System.out.println("GRANDE");
            }   break;
            default:
            System.out.println("INDEFINIDO!");
        }
                      
        
        /* usando If-else
        String sigla = "m";

        if(sigla == "p" || sigla=="P"){
        System.out.println("PEQUENO!");
        }else if(sigla =="m" || sigla=="M"){
            System.out.println("MÉDIO!");
        }else if(sigla=="g" || sigla=="G"){
            System.out.println("GRANDE!");
        }else{
            System.out.println("INDEFINIDO!");
        }*/
    }
}