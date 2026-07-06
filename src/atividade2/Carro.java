package atividade2;

public class Carro {

    private int chave;
    private int velocidade;
    private int macha;

    public Carro() {

    }

    public void getVelocidade() {
        System.out.println(velocidade + "KM");
    }

    public void ligar(){
        System.out.println("O carro esta ligado");
        this.chave = 1;
        this.velocidade = 0;
        this.macha = 0;
    }

    public void setMacha(){
        if (this.chave != 1){
            System.out.println("carro desligador");
            return;
        }

        this.macha += 1;

    }

    public void desligar(){
        if (this.velocidade == 0) {
            System.out.println("carro desligador");
            this.chave = 0;
            this.velocidade = 0;
            this.macha = 0;

        }else{
            System.out.println("seu carro tem que esta parado");
        }
    }


    public void acelerar(){
        if (this.chave != 1){
            System.out.println("carro desligador");
            return;
        }

        int limiteDeVelocidade = limite(this.macha);

        if (this.velocidade >= limiteDeVelocidade){
            System.out.println("você tem que muda de macha para acelera mais");
            return;
        }

        this.velocidade += 1;
        System.out.println("seu carro acelerou "+ this.velocidade+ " KM");

    }

    public int limite(int macha){
        return switch (macha){
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };
    }

    public void desacelerar(){
        if (this.chave != 1){
            System.out.println("carro desligador");
            return;
        }

        if (this.velocidade == 0){
            System.out.println("seu carro ja esta parado");
            this.velocidade = 0;
            return;
        }

        this.velocidade -=1;
        System.out.println("seu carro desacelereou para " + this.velocidade + "KM");



    }

    public void volante(String valor){
        if (this.chave != 1){
            System.out.println("carro desligador");
            return;
        }

        if (this.velocidade > 40){
            System.out.println("Diminua a velocidade para muda de direção ");
            return;
        }
        if (this.velocidade == 0 ){
            System.out.println("seu carro esta parado");
            return;
        }
        System.out.println("Seu carro mudou para " + valor);
    }


}
