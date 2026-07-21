package atividade4;

public class Gerente extends Funcionario {

    public Gerente(String email, String senha, String nome) {
        super(email, senha, nome, true);
    }


    public void ConsultaVenda(int numeroDeVenda){
        if (this.logado != true) {
            System.out.println("Login Failed");
            return;
        }

        System.out.println("Numero de vendas: " + numeroDeVenda);
    }

    public void relatorioFinaceiro(double finaceiro){
        if (this.logado != true) {
            System.out.println("Login Failed");
            return;
        }

        System.out.println("Relatorio de finaceiro...");
        System.out.println("==========================");
        System.out.println("esse e o relatorio: " + finaceiro);
        System.out.println("=========================");


    }


}
