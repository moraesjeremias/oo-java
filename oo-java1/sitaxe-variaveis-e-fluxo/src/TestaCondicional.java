public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 16;
        int quantidade = 3;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            if (quantidade >= 2){
                System.out.println("Você é menor, mas está acompanhado, pode entrar");
            } else{
                System.out.println("Você foi barrado no baile!");
            }
        }
    }
}
