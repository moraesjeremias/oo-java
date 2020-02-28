public class ControleBonificacao {

    private int soma;

    public void registra(Funcionario f){
        double boni = f.getBonification();
        this.soma += boni;
    }

    public int getSoma() {
        return this.soma;
    }
}
