package atividade3;

public class Familia extends Ingresso{
    private int numeroPessoas;

    public Familia(double valor, String nome, boolean dublado, int numeroPessoas) {
        super(valor, nome, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal(){
        double valorTotal = super.getValor() * 0.5;

        if (this.numeroPessoas > 3){
            valorTotal = valorTotal * 0.95;
        }
        return valorTotal;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

}
