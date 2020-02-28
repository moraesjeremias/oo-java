public class TestaGerente {
    public static void main(String[] args) {
        Gerente alex = new Gerente("Alexander", "78655432122");
        alex.setSenha(34226);
        alex.setSalario(7890.66);

        String nomeAlex = alex.getNome();
        String cpfAlex = alex.getCpf();
        double salarioAlex = alex.getSalario();

        boolean autenticou = alex.autentica(34226);

        System.out.println(autenticou);
        System.out.println(nomeAlex);
        System.out.println(cpfAlex);
        System.out.println(salarioAlex);
        System.out.println(alex.getBonification());
    }
}
