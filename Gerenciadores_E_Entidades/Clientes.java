package Gerenciadores_E_Entidades;
import javax.xml.crypto.Data;

abstract class Clientes {
    private String nome;
    private Integer dataNasci;
    private Integer documentoPessoal;

    public Clientes(){
    }

    public Clientes(String nome, Integer dataNasci, Integer documentoPessoal){
        this.nome = nome;
        this.dataNasci = dataNasci;
        this.documentoPessoal = documentoPessoal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDataNasci() {
        return this.dataNasci;
    }

    public void setDataNasci(Integer dataNasci) {
        this.dataNasci = dataNasci;
    }

    public Integer getDocumentoPessoal() {
        return this.documentoPessoal;
    }


    @Override
    public String toString(){
        return "Pessoa {nome = '" + nome + "', Data de Nascimento=' " + dataNasci + " ' Documento Pessoal = '" + documentoPessoal + "'}";
    }

}
