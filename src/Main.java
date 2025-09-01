public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua das Flores", 123);
        Endereco end2 = new Endereco("Avenida Brasil", 456);

        Pessoa p1 = new Pessoa("Maria", 25, end1);
        Pessoa p2 = new Pessoa("João", 30, end2);

        System.out.println("Dados das Pessoas:");
        System.out.println("------------------");
        p1.mostrarDados();
        System.out.println("------------------");
        p2.mostrarDados();
    }
}
