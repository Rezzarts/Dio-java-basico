public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
            System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

            System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(45);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
            
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.desligar();
            System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);




    }
}
