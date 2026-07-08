package atividade3;

public class Ingresso {
    private double valor;
    private String nome;
    private boolean dublado;

    public Ingresso(double valor, String nome, boolean dublado) {
        this.valor = valor;
        this.nome = nome;
        this.dublado = dublado;
    }

    public double getValorReal(){
        return this.valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public String getTipoAudio(){
        return  dublado ? "dublado" : "legendado";
    }
}
