import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String[] candidados = {"felipe", "maria", "julia", "paulo", "augusto"};

        for (String candidato : candidados) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativa = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativa++;
            } else {
                System.out.println("Contato realizado");
            }
        } while (continuaTentando && tentativa < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativa);
        }else {
            System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de " + tentativa + " tentativas realizada");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidados = {"felipe", "maria", "julia", "paulo", "augusto", "monica", "fabricio", "mirele", "daniela", "jose"};

        for (int i = 0; i < candidados.length; i++) {
                System.out.println("O candidato de numero " + (i+1) + " é " + candidados[i]);
        }

    }

    static void selecaoCandidatos() {
        String[] candidados = {"felipe", "maria", "julia", "paulo", "augusto", "monica", "fabricio", "mirele", "daniela", "jose"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salariobase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidados.length){
            String candidato = candidados[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if (salariobase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salariobase = 2000.0;
        if (salariobase > salarioPretendido) {
            System.out.println("ligar para o candidato");
        }else if (salariobase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
