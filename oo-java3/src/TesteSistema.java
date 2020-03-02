public class TesteSistema {
    public static void main(String[] args) {
        Gerente Alex = new Gerente("Alexandre","84761826472");
        Alex.setSenha(3333);

        SistemaInterno si = new SistemaInterno();

        si.autentica(Alex);
    }
}
