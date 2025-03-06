package Gerenciadores_E_Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorClientes extends Clientes {

    public GerenciadorClientes(){
    }
    
    public GerenciadorClientes(String nome, Integer dataNasci, Integer documentoPessoal){
        super(nome, dataNasci,  documentoPessoal);
    }

    public void CriaCliente(){
        Scanner sc = new Scanner(System.in);
        
        List<Object> clientes = new ArrayList<>();

        System.out.print("Digite seu nome Completo: ");
        clientes.add(sc.nextLine());
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        clientes.add(sc.nextInt());
        System.out.print("Digite seu CPF: ");
        clientes.add(sc.nextInt());
    
        System.out.println("Cliente cadastrado com sucesso!");
        //System.out.println("Seus dados são: \n" + clientes);
        
        sc.close();
    }

        
}
