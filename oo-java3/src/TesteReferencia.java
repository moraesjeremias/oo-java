public class TesteReferencia {
    public static void main(String[] args) {
        Gerente gui = new Gerente("Guilherme", "47562839102");
        gui.setNome("GUilherme");
        gui.setSalario(10000);

        EditorVideo igor = new EditorVideo("Igor", "47562839102");
        igor.setSalario(10000);

        Designer joao = new Designer("João", "47562839102");
        joao.setSalario(10000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gui);
        controle.registra(igor);
        controle.registra(joao);

        System.out.println(controle.getSoma());

    }
}
