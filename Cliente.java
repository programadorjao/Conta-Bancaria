public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(String cpf, String nome, String endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
}
