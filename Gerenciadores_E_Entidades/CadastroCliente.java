package Gerenciadores_E_Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CadastroCliente extends Clientes {

    public CadastroCliente() {
    }

    public CadastroCliente(String nomeCompleto, Date dataNascimento, Integer documentoPessoal) {
        super(nomeCompleto, dataNascimento, documentoPessoal);
    }

    public String getNome(){
        return this.nomeCompleto;
    }

    public void CriaCliente() {
        var scheduler = Executors.newScheduledThreadPool(1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome Completo: ");
        setNomeCompleto(sc.nextLine());
        boolean clienteCriadoComSucesso = false;
        do {
            try {
                System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
                String dataString = sc.nextLine();
                Boolean formatoCorretoData = dataString.length() != 10 || dataString.matches("\\\\d{2}/\\\\d{2}/\\\\d{4}");
                if(formatoCorretoData){
                    throw new IllegalArgumentException("Data inválida. O formato deverá ser: dd/MM/yyyy");
                }
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataNascimento = LocalDate.parse(dataString, fmt);
                clienteCriadoComSucesso = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }while(!clienteCriadoComSucesso);

            
              if(clienteCriadoComSucesso){
              System.out.print("Digite seu CPF: ");
              int documentoPessoal = sc.nextInt();
              System.out.println("Cadastrando Cliente, aguarde...");
              scheduler.schedule(() -> {
             System.out.println(getNomeCompleto() +
             ", seu cadastrado foi realizado com sucesso!");
             }, 3, TimeUnit.SECONDS);
             scheduler.shutdown();
             
             sc.close();
             }
             
            

        
    }

}
