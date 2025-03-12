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

    public String getNome() {
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
                if (formatoCorretoData) {
                    throw new IllegalArgumentException("Data inválida. O formato deverá ser: dd/MM/yyyy");
                }
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate.parse(dataString, fmt);
                clienteCriadoComSucesso = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!clienteCriadoComSucesso);

        if (clienteCriadoComSucesso) {
            Boolean cpfInvalido = false;
            do {
            try{
            System.out.print("Digite seu CPF: ");
            String valorCpf = sc.nextLine();
            valorCpf = valorCpf.replaceAll("[^0-9]", "");
            if(valorCpf.length() != 11){
                throw new IllegalArgumentException("CPF inválido. Deve conter 11 números");
            }
            cpfInvalido = true;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            }while(!cpfInvalido);

            boolean emailValido = false;
            do {
                try {
                    System.out.print("Digite seu E-mail: ");
                    String email = sc.nextLine();
                    String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                                                
                    Boolean emailConvertido = email.matches(EMAIL_REGEX);

                    if (!emailConvertido) {
                        throw new IllegalArgumentException("E-mail inválido. Por favor, digite um e-mail válido.");
                    }
                    emailValido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                
            } while (!emailValido);

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
