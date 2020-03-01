public class TesteFuncionario {
    public static void main(String[] args) {
        Designer jeremias = new Designer("Jeremias", "15080211717");
        jeremias.setSalario(3200.50);

        int cpfDoJere = jeremias.getCpf().length();
        System.out.println(cpfDoJere);
    }
}
