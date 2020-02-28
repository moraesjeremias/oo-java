public class TestaMetodos {

    public static void main(String[] args) {
        Conta contadoJeremias = new Conta();
        Conta contadoAlysson = new Conta();

        contadoJeremias.saldo = 1000;
        contadoAlysson.saldo = 500;
        boolean verificacao = contadoJeremias.transfere(200, contadoAlysson);

        if(verificacao){
            System.out.println("A transferência foi concluída!");
            System.out.println("O saldo atual de Jeremias é: " + contadoJeremias.saldo);
            System.out.println("O saldo atual de Alysson é: " + contadoAlysson.saldo);
        } else {
            System.out.println("Ocorreu um erro duranta a transação");
        }
    }
}
