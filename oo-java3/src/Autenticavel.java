public class Autenticavel extends Funcionario {

    private int senha;

    public Autenticavel(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double getBonification() {
        return 0;
    }
}
