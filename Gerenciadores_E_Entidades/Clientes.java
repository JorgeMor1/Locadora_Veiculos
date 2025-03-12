package Gerenciadores_E_Entidades;

import java.util.Date;

abstract class Clientes {
    protected String nomeCompleto;
    protected Date dataNascimento;
    protected Integer documentoPessoal;

    public Clientes(){
    }

    public Clientes(String nomeCompleto, Date dataNascimento, Integer documentoPessoal){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.documentoPessoal = documentoPessoal;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNasci() {
        return this.dataNascimento;
    }

    public void setDataNasci(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getDocumentoPessoal() {
        return this.documentoPessoal;
    }


    @Override
    public String toString(){
        return "Pessoa {nome = '" + nomeCompleto + "', Data de Nascimento=' " + dataNascimento + " ' Documento Pessoal = '" + documentoPessoal + "'}";
    }

}
