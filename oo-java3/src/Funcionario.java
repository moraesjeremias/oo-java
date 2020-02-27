public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        if(cpf.length() != 11){
            System.out.println("CPF inválido");
            this.cpf = "Inválido";
        } else {
            this.cpf = cpf;
        }
    }

    public double getBonification(){
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
