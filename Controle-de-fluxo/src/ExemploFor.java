import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Julio", "marcos", "gabriel"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;       
    }
}
