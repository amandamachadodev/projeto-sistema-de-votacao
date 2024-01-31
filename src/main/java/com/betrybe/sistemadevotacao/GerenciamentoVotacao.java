package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Classe GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas;
  private final ArrayList<PessoaEleitora> pessoasEleitoras;
  private final ArrayList<String> cpfsComputados;

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  /**
   * Construtor.
   */

  public boolean verificaNumero(int numero) {
    for (PessoaCandidata p: pessoasCandidatas) {
      if (p.getNumero() == numero) {
        return true;
      }
    }
    return false;
  }

  public boolean verificaCpf(String cpf) {
    for (PessoaEleitora p: pessoasEleitoras) {
      if (Objects.equals(p.getCpf(), cpf)) {
        return true;
      }
    }
    return false;
  }
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
      if (verificaNumero(numero)) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(pessoaCandidata);

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (verificaCpf(cpf)) {
      System.out.println("Pessoa eleitora já cadastrada!");
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(pessoaEleitora);

  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
