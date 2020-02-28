public class TestaConta {
    public static void main(String[] args) {
        Conta contadoJere = new Conta(4456, 89321);
        Cliente jeremias = new Cliente("Jeremias", "000000000", "developer");
        Cliente joana = new Cliente("Joana", "000000001", "CEO");
        contadoJere.setSaldo(1000);
        System.out.println(contadoJere.getSaldo());

        contadoJere.setTitular(jeremias);

        contadoJere.getTitular().setNome("Jeremias");
        System.out.println(contadoJere.getTitular().getNome());

        System.out.println(Cliente.getTotal());
    }
}
