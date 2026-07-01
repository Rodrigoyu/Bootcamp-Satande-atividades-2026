package atividade2;

public class Carro {

    private int chave;
    private int velocidade;
    private int macha;

    public Carro() {

    }

    public void ligar(){
        System.out.println("O carro esta ligado");
        this.chave = 1;
        this.velocidade = 0;
        this.macha = 0;
    }

    public void setMacha(){
        this.macha =this.macha + 1;
        System.out.println("mudou a macha para " + this.macha);
    }

    public void desligar(){
        if (this.velocidade == 0) {
            System.out.println("carro desligado");
            this.chave = 0;
            this.velocidade = 0;
            this.macha = 0;

        }else{
            System.out.println("seu carro tem que esta parado");
        }
    }

    public void acelerar(){
        if (this.chave == 1 && this.macha == 1 ){
            this.velocidade = this.velocidade + 1;
            System.out.println("seu carro acelorou"+ this.velocidade + "KM");
            if (this.velocidade == 20){
                this.velocidade = this.velocidade -1;

            }
        }
    }

    public void desacelerar(){
        if (this.chave == 1 && this.velocidade > 0){
            this.velocidade = this.velocidade - 1;
            System.out.println("seu carro diminuio a velocidade em "+ this.velocidade + "KM");
        }else if (this.chave == 0){
            System.out.println("seu carro esta desligado");
        }else{
            System.out.println("Seu carro ja esta parado");
        }
    }

    public void volante(String valor){
        if (this.chave == 1){
            if (valor.equalsIgnoreCase("esquerda")){
               System.out.println("virou a " + valor);
            }
        }
    }


}
