package Gerenciadores_E_Entidades;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CadastroCliente extends Clientes {

    public CadastroCliente() {
    }

    public CadastroCliente(String nome, Integer dataNasci, Integer documentoPessoal) {
        super(nome, dataNasci, documentoPessoal);
    }

    public void CriaCliente() {
        var scheduler = Executors.newScheduledThreadPool(1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome Completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        int dataNasci = sc.nextInt();
        System.out.print("Digite seu CPF: ");
        int documentoPessoal = sc.nextInt();
        CadastroCliente cliente = new CadastroCliente(nome, dataNasci, documentoPessoal);
        System.out.println("Cadastrando Cliente, aguarde...");
        scheduler.schedule(() -> {
            System.out.println(cliente.getNome() + ", seu cadastrado foi realizado com sucesso!");
        }, 3, TimeUnit.SECONDS);
        scheduler.shutdown();

        sc.close();
    }

}
