package Gerenciadores_E_Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GerenciadorReserva{
    Scanner sc = new Scanner(System.in);
    String resposta;
    GerenciadorEntradaUsuario gerenciador = new GerenciadorEntradaUsuario();

    public void veiculosDisponiveis(){
        Marcas carro = Marcas.HYUNDAI;
        Marcas moto = Marcas.KAWASAKI;
        gerenciador.selecaoTipoVeiculo();
        String veiculoInteresse = gerenciador.getVeiculoInteresse();
        Integer quantMeses = gerenciador.getquantMesesSelecionados();

        List<Veiculos> veiculosDisponiveis = new ArrayList<>();
            if (veiculoInteresse.equals("CARRO")) {
                veiculosDisponiveis.add(new Veiculos("HB20", 10000, 2019));
                {
                    Veiculos veiculo = veiculosDisponiveis.get(0);
                    System.out.println("Temos o seguintes modelos e a taxa de aluguel: " +
                            "Marca: " + carro + "\n" +
                            "Modelo: " + veiculo.getModelo() + "\n" +
                            "Quilometragem Atual: " + veiculo.getQuilometragem() + "\n" +
                            "Taxa de Aluguel: " + veiculo.taxa(carro.getValor(), quantMeses) + "\n");
                }
            } else if (veiculoInteresse.equals("MOTO")) {
                veiculosDisponiveis.add(new Veiculos("NINJA300", 9000, 2022));
                Veiculos veiculo = veiculosDisponiveis.get(0);
                System.out.println("Temos o seguintes modelos e a taxa de aluguel: " +
                        "Marca: " + moto + "\n" +
                        "Modelo: " + veiculo.getModelo() + "\n" +
                        "Quilometragem Atual: " + veiculo.getQuilometragem() + "\n" +
                        "Taxa de Aluguel: " + veiculo.taxa(carro.getValor(), quantMeses) + "\n");
            }
        }
        public void confirmacaoAluguel(){
            Boolean x;
            do {
                System.out.println("Deseja Alugar esse veículo? (S/N)");
                resposta = sc.nextLine().toUpperCase();

                x = !resposta.equals("S") && !resposta.equals("N");
                if (x) {
                    System.out.println("Opção inválida! \n" + "Vamos tentar novamente: ");
                }
            } while (x);   
        }

        public void mockLoading(){
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

             if (resposta.equals("S")) {
            System.out.println("OPS! Primeiro é necessário realizar seu cadastro: ");
            gerenciador.gerenciaCadastroCliente();
            try {
                System.out.println("Realizando o cadastro. Por favor, aguarde....");
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Reservando seu veículo. Por favor, aguarde...");
            scheduler.schedule(() -> {
                System.out.println("Seu veículo foi reservado com sucesso!!! \n"
                        + "Venha até nossa concessionária para buscar seu veículo!");
            }, 4, TimeUnit.SECONDS);
            scheduler.shutdown();
        } else if (resposta.equals("N")) {
            System.out.println("Lamentamos! Na próxima teremos mais veículos!");
        }
        }
        

}