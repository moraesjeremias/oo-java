public class Designer extends Funcionario {


    public Designer(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getBonification() {
        return super.getBonification() + 200;
    }

}
