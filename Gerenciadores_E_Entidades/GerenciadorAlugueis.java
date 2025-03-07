package Gerenciadores_E_Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorAlugueis extends Alugueis {
    public GerenciadorAlugueis() {
    }

    public GerenciadorAlugueis(String marcaVeiculos, String versaoVeiculo, Integer anoVeiculo,
            Integer quilometragemAtual) {
        super(marcaVeiculos, versaoVeiculo, anoVeiculo, quilometragemAtual);

    }

    public void AlugaVeiculos() {
        Scanner sc = new Scanner(System.in);

        List<Object> aluguel = new ArrayList<>();
        aluguel.add("HYUNDAI");
        aluguel.add("HB20");
        aluguel.add(2015);
        aluguel.add(10000);
        System.out.println("Teremos esses veículos disponíveis: " + aluguel);
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
            System.out.println("Veículo reservado com sucesso!!! \n"
                    + "Venha até nossa concessionária buscar seu veículo!");
        } else if (resposta.equals("N")) {
            System.out.println("Na próxima teremos mais veículos!");
        }
        sc.close();
    }

}
