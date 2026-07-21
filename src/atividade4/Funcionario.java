package atividade4;

public abstract class Funcionario {
    private String email;
    private String senha;
    private String nome;
    protected boolean adm;
    boolean logado;


    public Funcionario(String email, String senha, String nome, boolean adm ) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.adm = adm;
        this.logado = false;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAdm() {
        return adm;
    }

    public boolean login(String email, String senha) {
        if(this.email.equals(email) && this.senha.equals(senha)){
            this.logado = true;
            System.out.println("Login successful");
            System.out.println("Seja bem vindo! " + getNome());
            System.out.println("");
            return true;

        }else  {
            System.out.println("Login Failed");
            System.out.println("Email ou Senha invalido!");
            return false;
        }
    }

    public boolean logoff(){
        System.out.println("Logoff Successful");
        System.out.println("");
        return this.logado = false;

    }

    public void alteraDados(String nome, String email){
        if (this.logado == false) {
            System.out.println("Vc nao esta logado");
            return;
        }

        setEmail(nome);
        setNome(nome);
        System.out.println("Dados alterados com sucesso!");
    }

}
