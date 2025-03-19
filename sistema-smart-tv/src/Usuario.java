public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;

          System.out.println("Camal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Camal Atual : " + smartTv.canal);
       


        //System.out.println("Tv ligada ? " + smartTv.ligada);
        //System.out.println("Camal Atual : " + smartTv.canal);
        //System.out.println("Volume atual ? " + smartTv.volume);

    
    }
}
