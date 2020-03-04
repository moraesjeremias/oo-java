public class Administrador extends Funcionario implements Autenticavel {

    public Administrador(String nome, String cpf) {
        super(nome, cpf);
    }

    private int senha;

    @Override
    public double getBonification() {
        return 0;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
