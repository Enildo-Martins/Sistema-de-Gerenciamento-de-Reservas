public class Clients {
    private int id_client;
    private String nome;
    private String endereco;
    private int idade;
    private String sexo;
    private String preferenciaDeEstadia;

    public Clients(int id_client, String nome, String endereco, int idade, String sexo, String preferenciaDeEstadia) {
        this.id_client = id_client;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
        this.preferenciaDeEstadia = preferenciaDeEstadia;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPreferenciaDeEstadia() {
        return preferenciaDeEstadia;
    }

    public void setPreferenciaDeEstadia(String preferenciaDeEstadia) {
        this.preferenciaDeEstadia = preferenciaDeEstadia;
    }
}