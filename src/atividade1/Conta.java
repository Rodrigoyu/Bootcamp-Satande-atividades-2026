package atividade1;

public class Conta {
    private String nome;
    private double saldo;
    private double saldoTotal;
    private double chequeEspecial;



    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        setChequeEspecial();

    }

    public double getSaldoTotal() {
        return this.saldoTotal = this.saldo + this.chequeEspecial;
    }

    public  double getChequeEspecial(){
        return this.chequeEspecial;
    }

    public void deposito(double deposito){
        aplicaTaxar();
        this.saldo += deposito;
        System.out.println("Deposito confirmado!");

    }

    public void sacar(double saque){
        if (this.saldoTotal<= 0 || saque > this.saldoTotal ){
            System.out.println("Saldo insuficiente");
        }else {
            this.saldo -= saque;
            System.out.println("O seu saque foi realizado com sucesso!");
        }
    }

    public void verificaChequeEspecial(){
        if(this.saldo <= 0.0){
            System.out.println("Você está usando cheque especial!");
        }else{
            System.out.println("Você não está usando cheque especial!");
        }
    }
/*
* Math.abs e um metodo nativo do java  que serve para calcula o valor absoludo de um numero
* Em termos simples: ele transforma qualquer número negativo em positivo, e se o número já
*  for positivo, ele permanece igual.
* */
    public void aplicaTaxar(){
        if(this.saldo < 0.0){
            double saldoUsado = Math.abs(this.saldo);
            double taxa = saldoUsado * 0.2;
            this.saldo -= taxa;

        }
    }

    public void setChequeEspecial(){
        if(this.saldo <= 500.00){
            this.chequeEspecial = 50.00;
        }else{
            this.chequeEspecial = this.saldo * 0.2;
        }

    }
}
