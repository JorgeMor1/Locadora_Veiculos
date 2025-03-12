package Gerenciadores_E_Entidades;

import java.util.Scanner;

public class SelecaoDepartamento {
     
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
