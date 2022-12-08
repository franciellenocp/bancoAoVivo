package tech.ada.banco;

public class Pessoa {
    String nome;
    String dataNascimento; //Local Date
    String cpf;
    String telefone;

    public Pessoa(String nome, String cpf, String dataNascimento) {
//        System.out.println(cpf);       // da função - parâmetro do método
//        System.out.println(this.cpf); // acessar o objeto - atributo do construtor
        this.cpf = cpf; //
        this.dataNascimento = dataNascimento;
        this.nome = nome;

    }

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone) {
        System.out.println(cpf);       // da função - parâmetro do método
        System.out.println(this.cpf); // acessar o objeto - atributo do construtor
        this.cpf = cpf; //
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.telefone = telefone;

    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Data de Nascimento:" + dataNascimento + " Telefone: " + telefone;
    }
}
