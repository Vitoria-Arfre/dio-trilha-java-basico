public class Usuario{    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        
        System.out.println("Volume Atual?: " + smartTv.volume);


        System.out.println("TV Ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual?: " + smartTv.canal);
        System.out.println("Volume Atual?: " + smartTv.volume);

        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual: "+smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Novo Satus - TV Ligada?:" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Satus - TV Ligada?:" + smartTv.ligada);
        

    }
}
