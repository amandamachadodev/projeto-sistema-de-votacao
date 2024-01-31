package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas;
  private final ArrayList<PessoaEleitora> pessoasEleitoras;
  private final ArrayList<String> cpfsComputados;

  public GerenciamentoVotacao(ArrayList<PessoaCandidata> pessoasCandidatas,
      ArrayList<PessoaEleitora> pessoasEleitoras, ArrayList<String> cpfsComputados) {
    this.pessoasCandidatas = pessoasCandidatas;
    this.pessoasEleitoras = pessoasEleitoras;
    this.cpfsComputados = cpfsComputados;
  }

  /**
   * Construtor.
   */


  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
