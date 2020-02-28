public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private static int total = 0;

    public Cliente(String nome, String cpf, String profissao){
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        total += 1;
        System.out.println("Um novo cliente foi criado");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public static int getTotal(){
        return Cliente.total;
    }
}
