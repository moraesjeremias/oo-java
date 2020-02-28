public class EditorVideo extends Funcionario{


    public EditorVideo(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getBonification(){
        return super.getBonification() + 100;
    }

}
