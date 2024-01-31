package com.betrybe.sistemadevotacao;

/**
 * Subclasse PessoaEleitora da superclasse Pessoa.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
