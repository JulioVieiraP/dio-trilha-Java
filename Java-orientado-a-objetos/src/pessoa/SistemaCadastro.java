package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("marcos", "123");

        marcos.setEndereco("Rua das marias");
        System.out.println(marcos.getNome() + " " + marcos.getCpf() + " " + marcos.getEndereco());
    }
}
