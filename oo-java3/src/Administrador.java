public class Administrador extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Administrador(String nome, String cpf) {
        super(nome, cpf);
        this.autenticador = new Autenticador();
    }

    private int senha;

    @Override
    public double getBonification() {
        return 0;
    }

<<<<<<< HEAD
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
=======
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
>>>>>>> 60460b79d1989e1622faf5b4e429476cf1d7efec
    }
}
