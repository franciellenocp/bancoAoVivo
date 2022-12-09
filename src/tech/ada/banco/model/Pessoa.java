package tech.ada.banco.model;

import java.time.LocalDate;


public class Pessoa {
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;
    private String nome;

//    public Pessoa(String nome, String cpf, String dataNascimento) {
////        System.out.println(cpf);       // da função - parâmetro do método
////        System.out.println(this.cpf); // acessar o objeto - atributo do construtor
//        this.cpf = cpf; //
//        this.dataNascimento = dataNascimento;
//        this.nome = nome;
//
//    }

//    public Pessoa(String nome, String cpf, String dataNascimento, String telefone) {
//        System.out.println(cpf);       // da função - parâmetro do método
//        System.out.println(this.cpf); // acessar o objeto - atributo do construtor
//        this.cpf = cpf; //
//        this.dataNascimento = dataNascimento;
//        this.nome = nome;
//        this.telefone = telefone;
//
//    }

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
        setCpf(cpf);
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this(nome, cpf, LocalDate.parse(dataNascimento));
    }

    public String toString() {
        return "Nome: " + nome + " telefone: " + telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.plusYears(18).isAfter(LocalDate.now())) {
            throw new RuntimeException("Data inválida!");
        } else {
            this.dataNascimento = dataNascimento;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new RuntimeException("Tamanho do CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

