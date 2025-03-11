import Gerenciadores_E_Entidades.GerenciadorAlugueis;
import Gerenciadores_E_Entidades.GerenciadorEntradaUsuario;

public class Main {

    public static void main(String[] args) {
        GerenciadorEntradaUsuario selecaoDepartamento = new GerenciadorEntradaUsuario();
        String departamentoSelecionado = selecaoDepartamento.selecaoDepartamento();

        switch (departamentoSelecionado) {
            case "A":
                GerenciadorEntradaUsuario criaCliente = new GerenciadorEntradaUsuario();
                criaCliente.gerenciaCadastroCliente();
                break;
            case "B":
                GerenciadorEntradaUsuario criaVeiculos = new GerenciadorEntradaUsuario();
                criaVeiculos.cadastraVeiculo();
                break;
            case "C":
                GerenciadorAlugueis gerenciaAlugueis = new GerenciadorAlugueis();
                gerenciaAlugueis.executeSelecaoVeiculo();
                break;

            default:
                System.out.println("Essa opção não seleciona nenhum de nossos serviços. Até mais!");
                break;
        }

    }
}
