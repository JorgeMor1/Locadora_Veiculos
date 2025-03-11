package Gerenciadores_E_Entidades;
abstract class Alugueis {
    private String versaoVeiculo;
    private Integer anoVeiculo;
    private Integer quilometragemAtual;

    public Alugueis(){}


    public Alugueis(String marcaVeiculo, String versaoVeiculo, Integer anoVeiculo, Integer quilometragemAtual) {
        this.versaoVeiculo = versaoVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.quilometragemAtual = quilometragemAtual;
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
        return " 'Versao = {'" + versaoVeiculo + "' Ano ='" + anoVeiculo + "' + Quilometragem ='" + quilometragemAtual +  "'}";   
    }

    public double taxa( double valorVeiculo){
        Double tarifaMinima = 0.10;
        return valorVeiculo * tarifaMinima;
    }

}
