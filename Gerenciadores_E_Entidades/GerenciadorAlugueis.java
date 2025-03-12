package Gerenciadores_E_Entidades;

public class GerenciadorAlugueis extends Alugueis {
    private GerenciadorEntradaUsuario entradaUsuario;
    public GerenciadorAlugueis() {
        this.entradaUsuario = new GerenciadorEntradaUsuario();
    }

    public GerenciadorAlugueis(String marcaVeiculos, String versaoVeiculo, Integer anoVeiculo,
            Integer quilometragemAtual) {
        super(marcaVeiculos, versaoVeiculo, anoVeiculo, quilometragemAtual);
        this.entradaUsuario = new GerenciadorEntradaUsuario();
    }

}