public class Autenticador {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Funcionário logado com sucesso!");
            return true;
        } else {
            return false;
        }
    }
}
