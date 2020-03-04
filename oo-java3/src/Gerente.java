<<<<<<< HEAD
public class Gerente extends Funcionario implements Autenticavel {
=======
public class Gerente extends Funcionario {

    private Autenticador autenticador;

>>>>>>> 60460b79d1989e1622faf5b4e429476cf1d7efec
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
