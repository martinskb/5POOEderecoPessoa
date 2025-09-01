/*
5. Crie a classe Pessoa com:
• Atributos privados: nome (String),
idade (int)
• Um construtor que receba nome e idade
• Métodos getNome() e getIdade()
Crie a classe Endereco com:
• Atributos privados: rua (String),
numero (int)
• Um construtor que receba rua e número
• Métodos getRua() e getNumero()
POO 31
Associe as classes:
• Adicione na classe Pessoa um atributo do
tipo Endereco chamado endereco
• Altere o construtor de Pessoa para também
receber um Endereco
• Crie um método mostrarDados() que
exiba o nome, idade e o endereço da pessoa
No main:
• Crie dois objetos Endereco
• Crie duas pessoas, cada uma com seu
endereço
• Mostre os dados de cada pessoa
*/
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
