public class criarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 150;
        System.out.println(segundaConta.saldo);

        Conta terceiraConta = primeiraConta;
        terceiraConta. saldo = 50;
        System.out.println("primeira conta tem: " + primeiraConta.saldo);
        System.out.println("terceira conta tem: " + terceiraConta.saldo);
    }
}
