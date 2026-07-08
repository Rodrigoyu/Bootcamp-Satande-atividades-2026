package atividade3;

public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(double valor, String nome, boolean dublado) {
        super(valor, nome, dublado);
    }

    @Override
    public double getValorReal(){
        return super.getValor() * 0.5;
    }

}
