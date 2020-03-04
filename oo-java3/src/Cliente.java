public class Cliente implements Autenticavel {
<<<<<<< HEAD

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
=======
    private Autenticador autenticador;

    public Cliente(){
        this.autenticador = new Autenticador();
    }

    @Override
    public void setSetnha(int senha) {
        this.autenticador.setSenha(senha);
>>>>>>> 60460b79d1989e1622faf5b4e429476cf1d7efec
    }

    @Override
    public boolean autentica(int senha) {
<<<<<<< HEAD
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
=======
        return this.autenticador.autentica(senha);
>>>>>>> 60460b79d1989e1622faf5b4e429476cf1d7efec
    }
}
