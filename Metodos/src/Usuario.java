public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

    }
}
