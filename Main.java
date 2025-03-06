import java.util.Scanner;

import Gerenciadores_E_Entidades.GerenciadorClientes;
import Gerenciadores_E_Entidades.GerenciadorVeiculos;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo! O que deseja fazer hoje ? \n"
                + "(A) - Cadastrar um novo cliente! \n"
                + "(B) - Cadastrar um novo Veículo");
        String selecao = sc.nextLine();

        switch (selecao.toUpperCase()) {
            case "A":
                GerenciadorClientes criaCliente = new GerenciadorClientes();
                criaCliente.CriaCliente();
                break;
            case "B":
                GerenciadorVeiculos criaVeiculos = new GerenciadorVeiculos();
                criaVeiculos.cadastraVeiculo();
                break;

            default:
                System.out.println("Até mais!");
                break;
        }
        sc.close();

    }
}
