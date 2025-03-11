package Gerenciadores_E_Entidades;

public class Veiculos {

    private String modelo;
    private Integer quilometragem;
    private Integer anoVeiculo;

    public Veiculos() {

    }

    public Veiculos(String modelo, Integer quilometragem, Integer anoVeiculo) {
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.anoVeiculo = anoVeiculo;

    }

    public String getModelo() {
        return this.modelo;
    }

    public Integer getQuilometragem() {
        return this.quilometragem;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoVeiculo(Integer anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Integer getAnoVeiculo() {
        return this.anoVeiculo;
    }

    @Override
    public String toString() {
        return "'Modelo = " + modelo + "' Quilometragem atual: " + quilometragem + "}";
    }

    public Double taxa(Double valorVeiculo, Integer quantidadeMes) {
        Double taxa = 0.10;
        return (valorVeiculo / quantidadeMes) * taxa;
    };

}