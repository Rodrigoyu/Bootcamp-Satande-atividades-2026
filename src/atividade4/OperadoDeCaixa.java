package atividade4;

public class OperadoDeCaixa extends  Funcionario {
    private double caixa;
    private double caixaInicial;
    private boolean caixaAberto = false;

    public OperadoDeCaixa(String email, String senha, String nome) {
        super(email, senha, nome, false);
        this.caixaInicial = 0;
    }

    public double getCaixa() {
        return this.caixa;
    }


    public void opeCaixa() {
        if (!this.logado){
            System.out.println("Voce nao esta logado!");
            return;
        }
        this.caixaAberto = true;
        this.caixaInicial = 300;
        System.out.println("Caixa aberto, seja bem vindo!" + getNome());

    }

    public void offCaixa() {
        if (!this.logado){
            System.out.println("Voce nao esta logado!");
            this.caixaAberto = false;
            return;
        }
        this.caixaAberto = false;
        System.out.println("Caixa fechado!");
    }


    public void receberPagamento(double valor){
        if (this.caixaAberto != true ) {
            System.out.println("Voce nao esta logado!");
            return;
        }
        this.caixaInicial += valor;
        this.caixa = this.caixaInicial;
        System.out.println("Pagamento recebido com sucesso ");
    }
    @Override
    public boolean logoff() {
        return this.caixaAberto = false;
    }

}
