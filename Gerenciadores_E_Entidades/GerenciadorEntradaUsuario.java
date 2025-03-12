package Gerenciadores_E_Entidades;

public class GerenciadorEntradaUsuario {

    public void gerenciaCadastroCliente() {
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.CriaCliente();
    }

    public void cadastraVeiculo() {
        CadastroVeiculos cadstroVeiculo = new CadastroVeiculos();
        cadstroVeiculo.cadastraVeiculo();
    }

    public String selecaoDepartamento(){
        SelecaoDepartamento selecaoDepartamento = new SelecaoDepartamento();
        return selecaoDepartamento.selecaoDepartamento();
    }

    public void selcaoTipoVeiculo(){

    }
}