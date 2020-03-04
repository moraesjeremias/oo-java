public class SistemaInterno {
    private int senha = 3333;

    public void autentica(Autenticavel a) {
        boolean autenticou = a.autentica(this.senha);

        if(autenticou){
            System.out.println("Bem-vindo(a) ao Sistema!");
        } else {
            System.out.println("Acesso Negado! Tente novamente");
        }
    }
}
