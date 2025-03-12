package Gerenciadores_E_Entidades;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConfirmaReservaVeiculos {
    Scanner sc = new Scanner(System.in);
    String resposta;
    
    public String confirmacaoAluguel() {        
        if (resposta == null) {
        do {
            System.out.println("Deseja Alugar esse veículo? (S/N)");
            resposta = sc.nextLine().toUpperCase();
            if (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Opção inválida! \n" + "Vamos tentar novamente: ");
            }
        } while (!resposta.equals("S") && !resposta.equals("N")); 
            }
        return resposta;
        
}

    public void mockLoading() {
        String resposta = confirmacaoAluguel();
        CadastroCliente cadastroCliente = new CadastroCliente();
        

        if (resposta.equals("S")) { 
            System.out.println("OPS! Primeiro é necessário realizar seu cadastro.");
            cadastroCliente.CriaCliente();

            System.out.println("Realizando o cadastro. Por favor, aguarde....");
            simularProcesso(4500);

            System.out.println("Reservando seu veículo. Por favor, aguarde...");
            simularProcesso(4000);

            System.out.println( cadastroCliente.getNomeCompleto() + " Seu veículo foi reservado com sucesso!\n"
                    + "Venha até nossa concessionária para buscar seu veículo!");
        } else {
            System.out.println("Lamentamos! Na próxima teremos mais veículos!");
        }
    }

    private void simularProcesso(int tempoMillis) {
        try {
            TimeUnit.MILLISECONDS.sleep(tempoMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Erro durante a simulação do processo.");
        }
    }
}
