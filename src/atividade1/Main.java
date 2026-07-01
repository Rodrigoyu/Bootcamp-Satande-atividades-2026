package atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        String nome = sc.next();


        //O metodo .trim() remove espaços vazios acidentais

        //isEmpty() é um metodo que serve para verificar se
        // uma String (ou uma lista) está completamente vazia,
        // ou seja, se o tamanho (length) dela é igual a 0.

        while (nome.trim().isEmpty()){
            System.out.println("Seu nome e obrigadorio");
            nome = sc.next();

        }

        System.out.println("Deseja deposita algum valor Inicial?(y/n");
        String confirmaSaldoInicial = sc.next();
        double saldoInicial = 0.0;
        if (confirmaSaldoInicial.equalsIgnoreCase("y")){
            System.out.println("Digite o valor do saldo Inicial");
             saldoInicial = sc.nextDouble();

        }

        Conta c = new Conta(nome , saldoInicial);

    System.out.println("Seja bem vindo, " + nome);
for (int i = 0; i < 7;) {
    System.out.println("==========================================================");
    System.out.println("escolha umas das opções a seguir");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - consultar cheque especial");
    System.out.println("3 - Depositar dinheiro");
    System.out.println("4 - Sacar dinheiro");
    System.out.println("5 - Pagar um boleto");
    System.out.println("6 - Verificar se a conta está usando cheque especial.");
    System.out.println("7 - sair");
    System.out.println("==========================================================");
    String opcao = sc.next();

    switch (opcao) {
        case "1":
            System.out.println(c.getSaldoTotal());
            break;
        case "2":

            System.out.println(c.getChequeEspecial());
            break;
        case "3":
            System.out.println("Deposite o valor desejado:");
            double valor = sc.nextDouble();
            c.deposito(valor);
            break;
        case "4":
            System.out.println("Saque o valor desejado:");
            double saque = sc.nextDouble();
            c.sacar(saque);
            break;
        case "5":
            System.out.println("Digite o valor do boleto:");
            double boleto = sc.nextDouble();
            c.sacar(boleto);
            break;
        case "6":
            c.verificaChequeEspecial();
            break;
        case "7":
        default:
            System.out.println("Finalisando...");
            i = 8;
    }
}

    }
}
