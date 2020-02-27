public class Gerente extends Funcionario{
    private int senha = 1111;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Funcionário logado com sucesso!");
            return true;
        } else {
            return false;
        }
    }
}
