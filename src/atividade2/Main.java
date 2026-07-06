package atividade2;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Carro c = new Carro();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; ){
            System.out.println("=======================================");
            System.out.println("escolha uma das opçoes a seguir");
            System.out.println("1 - ligar");
            System.out.println("2 - desligar");
            System.out.println("3 - acelera");
            System.out.println("4 - desacelera");
            System.out.println("5 - volante");
            System.out.println("6 - verifica velosidade");
            System.out.println("7 - macha");
            System.out.println("8 - sair");
            int opcao = sc.nextInt();
            System.out.println("=======================================");
            switch (opcao){
                case 1:
                    c.ligar();
                    break;
                case 2:
                    c.desligar();
                    break;
                case 3:
                     c.acelerar();
                     break;
                case 4:
                    c.desacelerar();
                    break;
                case 5:
                    System.out.println("digite a direcão:");
                    String valor = sc.nextLine();
                    c.volante(valor);
                    break;
                case 6:
                    c.getVelocidade();
                    break;
                case 7:
                    c.setMacha();
                    break;
                case 8:
                default:
                    System.out.println("Finalizando...");
                    i = 9;
            }
        }

    }
}
