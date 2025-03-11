package Gerenciadores_E_Entidades;

import java.util.Scanner;

public class GerenciadorEntradaUsuario {
    Scanner sc = new Scanner(System.in);
    boolean semMarca = false;
    private String veiculoInteresse;
    private Integer quantMeses;

    public void selecaoTipoVeiculo() {
        do {
            try {
                System.out.println("Você deseja um Carro ou uma Moto? \n");
                veiculoInteresse = sc.nextLine().toUpperCase();

                if (!veiculoInteresse.equals("CARRO") && !veiculoInteresse.equals("MOTO")) {
                    throw new IllegalArgumentException("Opção inválida! Digite CARRO ou MOTO.");
                }
                System.out.println("Qual a quantidade de meses de aluguel ? ");
                quantMeses = sc.nextInt();
                sc.nextLine();
                semMarca = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                semMarca = true;
            }
        } while (semMarca);
    }

    public Integer getquantMesesSelecionados() {
        return quantMeses;
    }

    /*
     * 
     * public Integer selecionaMeses() {
     * System.out.println("Qual a quantidade de meses de aluguel ? ");
     * Integer quantMeses = sc.nextInt();
     * sc.nextLine();
     * return quantMeses;
     * }
     */

    public String getVeiculoInteresse() {
        return veiculoInteresse;
    }

    public void reserva() {
        GerenciadorReserva gerenciaReserva = new GerenciadorReserva();
        gerenciaReserva.veiculosDisponiveis();
        gerenciaReserva.confirmacaoAluguel();
        gerenciaReserva.mockLoading();

    }

    public void gerenciaCadastroCliente() {
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.CriaCliente();
    }

    public void cadastraVeiculo() {
        CadastroVeiculos cadstroVeiculo = new CadastroVeiculos();
        cadstroVeiculo.cadastraVeiculo();
    }

    public String selecaoDepartamento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo! \n O que deseja fazer hoje ? \n"
                + "(A) - Cadastrar um novo cliente! \n"
                + "(B) - Cadastrar um novo Veículo \n"
                + "(C) - Alugar Veículos");
        String selecao = sc.nextLine();
        return selecao.toUpperCase();
    }
}