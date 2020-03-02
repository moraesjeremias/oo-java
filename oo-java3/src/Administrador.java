public class Administrador extends Funcionario {

    public Administrador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double getBonification() {
        return 0;
    }
}
