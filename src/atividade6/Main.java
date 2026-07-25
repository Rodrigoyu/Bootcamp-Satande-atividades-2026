package atividade6;

//Alimentação 1%;
//Saude e bem estar 1.5%;
//Vestuário 2.5%;
//Cultura 4%.

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Alimentacao arroz = new Alimentacao(100);
        Saude remedio = new Saude(200);
        Vestuario roupa = new Vestuario(80);
        Cultura livro = new Cultura(50);

        List<Produto> carrinho = List.of(arroz, remedio, roupa, livro);

        for (Produto p : carrinho) {
            System.out.println("Imposto: " + p.calcularImposto());
        }

    }


    public static class Alimentacao implements Produto {
        private double preco;

        public Alimentacao(double preco) {
            this.preco = preco;
        }

        @Override
        public double calcularImposto() {
            return this.preco * 0.01;
        }

    }

    public static class Saude implements Produto {
        private double preco;

        public Saude(double preco) {
            this.preco = preco;
        }
        @Override
        public double calcularImposto() {
            return this.preco * 0.015;
        }
    }

    public static class Vestuario implements Produto {
        private double preco;
        public Vestuario(double preco) {
            this.preco = preco;
        }
        @Override
        public double calcularImposto() {
            return this.preco * 0.025;
        }
    }

    public static class Cultura implements Produto {
        private double preco;
        public Cultura(double preco) {
            this.preco = preco;
        }
        @Override
        public double calcularImposto() {
            return this.preco * 0.04;
        }
    }
}
