public class TestaCliente {
    public static void main(String[] args) {
        Conta contaDoJeremias = new Conta();
        contaDoJeremias.saldo = 100;

        contaDoJeremias.titular = new Cliente();
        String nome = contaDoJeremias.titular.nome = "Jeremias";
        System.out.println(nome);
    }
}
