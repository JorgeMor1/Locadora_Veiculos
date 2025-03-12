import Gerenciadores_E_Entidades.ConfirmaReservaVeiculos;
import Gerenciadores_E_Entidades.DisponibilidadeVeiculos;
import Gerenciadores_E_Entidades.GerenciadorEntradaUsuario;
import Gerenciadores_E_Entidades.SelecionaModeloVeiculos;

public class Main {

    public static void main(String[] args) {
        GerenciadorEntradaUsuario gerenciamentoEntrada = new GerenciadorEntradaUsuario();
        String departamentoSelecionado = gerenciamentoEntrada.selecaoDepartamento();

        DisponibilidadeVeiculos gerenciaAlugueis = new DisponibilidadeVeiculos();
        SelecionaModeloVeiculos selecionaVeiculo = new SelecionaModeloVeiculos();
        ConfirmaReservaVeiculos confirmacao = new ConfirmaReservaVeiculos();

        switch (departamentoSelecionado) {
            case "A":
                gerenciamentoEntrada.gerenciaCadastroCliente();
                break;
            case "B":
                gerenciamentoEntrada.cadastraVeiculo();
                break;
            case "C":
                selecionaVeiculo.selecaoTipoVeiculo();
                gerenciaAlugueis.veiculosDisponiveis(selecionaVeiculo);
                confirmacao.confirmacaoAluguel();
                confirmacao.mockLoading();            
                break;
            default:
                System.out.println("Essa opção não seleciona nenhum de nossos serviços. Até mais!");
                break;
        }
    }
}
