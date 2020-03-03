public class Gerente extends Funcionario {

    private Autenticador autenticador;

    private int senha = 1111;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
        this.autenticador = new Autenticador();
    }


    public double getBonification() {
        return super.getSalario();
    }


    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }


    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

}
