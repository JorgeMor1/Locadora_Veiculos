package Gerenciadores_E_Entidades;
abstract class Alugueis {
    private String marcaVeiculo;
    private String versaoVeiculo;
    private Integer anoVeiculo;
    private Integer quilometragemAtual;

    public Alugueis(){}


    public Alugueis(String marcaVeiculo, String versaoVeiculo, Integer anoVeiculo, Integer quilometragemAtual) {
        this.marcaVeiculo = marcaVeiculo;
        this.versaoVeiculo = versaoVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.quilometragemAtual = quilometragemAtual;
    }

    public String getMarcaVeiculo() {
        return this.marcaVeiculo;
    }

    public String getVersaoVeiculo() {
        return this.versaoVeiculo;
    }


    public Integer getAnoVeiculo() {
        return this.anoVeiculo;
    }

    public Integer getQuilometragemAtual() {
        return this.quilometragemAtual;
    }

    @Override
    public String toString(){
        return "Marca = {'" + marcaVeiculo + "' Versao = '" + versaoVeiculo + "' Ano ='" + anoVeiculo + "' + Quilometragem ='" + quilometragemAtual +  "'}";   
    }

}
