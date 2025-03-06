public class Clientes {
    private String nome;
    private String sobrenome;
    private String sexo;
    private Integer idade;
    private Integer documento;

    public Clientes(){
    }

    public Clientes(String nome, String sobrenome, String sexo, Integer idade, Integer documento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.documento = documento;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getDocumento() {
        return this.documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }


}
