package atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("junio@123.com", "junio123", "junio");
        Vendedor vendedor = new Vendedor("vend@gmail.com", "vend123", "paulo");
        OperadoDeCaixa operado = new OperadoDeCaixa("nana@gmail.com", "nana123", "nana");
        Scanner sc = new Scanner(System.in);

        vendedor.login("vend@gmail.com", "vend123");
        vendedor.venda();
        vendedor.venda();
        vendedor.mostraVenda();
        vendedor.logoff();

        operado.login("nana@gmail.com", "nana123");
        operado.opeCaixa();
        operado.receberPagamento(400);
        operado.receberPagamento(300.50);
        operado.offCaixa();
        operado.logoff();

        gerente.login("junio@123.com", "junio123");
        gerente.ConsultaVenda(vendedor.getNumeroDeVenda());
        gerente.relatorioFinaceiro(operado.getCaixa());
        gerente.logoff();

        }
    }

