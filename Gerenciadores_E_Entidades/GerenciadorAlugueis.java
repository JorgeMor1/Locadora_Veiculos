package Gerenciadores_E_Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GerenciadorAlugueis extends Alugueis {
    public GerenciadorAlugueis() {
    }

    public GerenciadorAlugueis(String marcaVeiculos, String versaoVeiculo, Integer anoVeiculo,
            Integer quilometragemAtual) {
        super(marcaVeiculos, versaoVeiculo, anoVeiculo, quilometragemAtual);

    }

    public void AlugaVeiculos() {
        Scanner sc = new Scanner(System.in);
        var scheduler = Executors.newScheduledThreadPool(1);
        GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();

        List<Object> aluguel = new ArrayList<>();
        aluguel.add("HYUNDAI");
        aluguel.add("HB20");
        aluguel.add(2015);
        aluguel.add(10000);
        System.out.println("Temos esse(s) veículo(s) disponível: \n" + aluguel + "\n");
        String resposta;
        Boolean x;
        do {
            System.out.println("Deseja Alugar esse veículo? (S/N)");
            resposta = sc.nextLine().toUpperCase();

            x = !resposta.equals("S") && !resposta.equals("N");
            if (x) {
                System.out.println("Opção inválida! \n" + "Vamos tentar novamente: ");
            }
        } while (x);

        if (resposta.equals("S")) {
            System.out.println("OPS! Primeiro é necessário realizar seu cadastro: ");
            gerenciadorClientes.CriaCliente();
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
            System.out.println("Na próxima teremos mais veículos!");
        }
        sc.close();
    }

}
