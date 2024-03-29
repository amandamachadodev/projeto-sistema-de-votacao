package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * metodo main.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    int cadastrarCandidato = 0;
    Scanner input = new Scanner(System.in);
    String menuCandidato = """
        Cadastrar pessoa candidata?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:""";
    System.out.println(menuCandidato);
    cadastrarCandidato = Integer.parseInt(input.next());
    while (cadastrarCandidato == 1) {
      System.out.println("Entre com o nome da pessoa candidata:");
      String nomeCandidato = input.next();
      System.out.println("Entre com o número da pessoa candidata:");
      int numeroCandidato = Integer.parseInt(input.next());
      gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);
      System.out.println(menuCandidato);
      cadastrarCandidato = Integer.parseInt(input.next());;
    }

    String menuEleitor = """
        Cadastrar pessoa eleitora?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:""";
    int cadastrarEleitor = 0;
    System.out.println(menuEleitor);
    cadastrarEleitor = Integer.parseInt(input.next());
    while (cadastrarEleitor == 1) {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String nomeEleitor = input.next();
      System.out.println("Entre com o CPF da pessoa eleitora:");
      String cpf = input.next();
      gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitor, cpf);
      System.out.println(menuEleitor);
      cadastrarEleitor = Integer.parseInt(input.next());

    }

    int cadastrarVoto = 0;
    String menuVotacao = """
        Entre com o número correspondente à opção desejada:
         1 - Votar
         2 - Resultado Parcial
         3 - Finalizar Votação""";
    System.out.println(menuVotacao);
    cadastrarVoto = Integer.parseInt(input.next());
    while (cadastrarVoto == 1 | cadastrarVoto == 2) {
      if (cadastrarVoto == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = input.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroCandidato = Integer.parseInt(input.next());
        gerenciamentoVotacao.votar(cpf, numeroCandidato);
      } else {
        gerenciamentoVotacao.mostrarResultado();
        System.out.println(menuVotacao);
      }
      System.out.println(menuVotacao);
      cadastrarVoto = Integer.parseInt(input.next());
    }
    gerenciamentoVotacao.mostrarResultado();
    input.close();
  }

}
