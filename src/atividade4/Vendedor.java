package atividade4;

public class Vendedor extends Funcionario{
    private  int numeroDeVenda;
    public Vendedor(String email, String senha, String nome) {
        super(email, senha, nome, false);
        this.numeroDeVenda = 0;
    }

    public int getNumeroDeVenda() {
        return this.numeroDeVenda;
    }

    public void mostraVenda(){
        if (!this.logado){
            System.out.println("você não esta logado!");
            return;
        }
        System.out.println("Numero de Venda: " + this.numeroDeVenda);
    }

    public void venda(){
        if (this.logado == false) {
            System.out.println("Vc nao esta logado");
            return;
        }
        this.numeroDeVenda++;
         System.out.println("Venda realizada com sucesso!");
    }



}
