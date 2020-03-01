public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double deposita(double valor) {
        return super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 2;
        return super.saca(valorASacar);
    }
}
