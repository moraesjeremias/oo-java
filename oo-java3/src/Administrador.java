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

    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);

    }
}
