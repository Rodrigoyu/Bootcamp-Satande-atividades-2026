package atividade3;

public class Main {
    public  static void main(String[] args){
        Ingresso ingressoComum = new Ingresso(40.0, "Batman", false);
        System.out.println("Filme: " + ingressoComum.getNome() + " (" + ingressoComum.getTipoAudio() + ")");
        System.out.println("Valor Ingresso Comum: R$ " + ingressoComum.getValorReal());
        System.out.println("---");

        Ingresso meia = new MeiaEntrada(40.0, "Batman", false);
        System.out.println("Valor Meia Entrada: R$ " + meia.getValorReal());
        System.out.println("---");

        Ingresso familiaPequena = new Familia(40.0, "Batman", false, 3);
        System.out.println("Valor Família (3 pessoas): R$ " + familiaPequena.getValorReal());

        Ingresso familiaGrande = new Familia(40.0, "Batman", false, 5);
        System.out.println("Valor Família (4 pessoas com desconto): R$ " + familiaGrande.getValorReal());
    }
}
