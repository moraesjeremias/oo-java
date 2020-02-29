public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(9087, 5643);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(9087, 6632);
        cp.deposita(100);

        cc.transfere(20.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
