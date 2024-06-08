package enums;

public class Sistema {
    public static void main(String[] args) {

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getNome());

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla());
            
        }
    }
}
