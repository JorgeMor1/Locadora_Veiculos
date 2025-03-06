package Gerenciadores_E_Entidades;

abstract class Veiculos {
    private String marca;
    private String modelo;
    private Integer quilometragem;
    private Integer anoVeiculo;
    
    public Veiculos(){

    }

    public Veiculos(String marca, String modelo, Integer quilometragem, Integer anoVeiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.anoVeiculo = anoVeiculo;

    }


    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Integer getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Integer getAnoVeiculo() {
        return this.anoVeiculo;
    }

    @Override
    public String toString(){
        return "'Marca= {" + marca + "' Modelo = " + modelo + "' Quilometragem atual: " + quilometragem  + "}";
    }

}