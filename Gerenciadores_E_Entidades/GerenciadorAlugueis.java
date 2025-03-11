package Gerenciadores_E_Entidades;

public class GerenciadorAlugueis extends Alugueis {
    private GerenciadorEntradaUsuario entradaUsuario;
    public GerenciadorAlugueis() {
        this.entradaUsuario = new GerenciadorEntradaUsuario();
    }
    GerenciadorReserva gerenciadorReserva = new GerenciadorReserva();

    public GerenciadorAlugueis(String marcaVeiculos, String versaoVeiculo, Integer anoVeiculo,
            Integer quilometragemAtual) {
        super(marcaVeiculos, versaoVeiculo, anoVeiculo, quilometragemAtual);
        this.entradaUsuario = new GerenciadorEntradaUsuario();
    }

    public void executeSelecaoVeiculo(){
        entradaUsuario.selecaoTipoVeiculo();
        entradaUsuario.reserva();
    }


    










/* 
    public void AlugaVeiculos() {
        Scanner sc = new Scanner(System.in);
        var scheduler = Executors.newScheduledThreadPool(1);
        GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();
        Boolean semMarca;
        Marcas carro = Marcas.HYUNDAI;
        Marcas moto = Marcas.KAWASAKI;
        do {
            semMarca = false;
            String veiculoInteresse;
            try {
                System.out.println("Você deseja um Carro ou uma Moto? \n");
                veiculoInteresse = sc.nextLine().toUpperCase();
                if (!veiculoInteresse.equals("CARRO") && !veiculoInteresse.equals("MOTO")) {
                    throw new IllegalArgumentException("Opção inválida! Digite CARRO ou MOTO.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                semMarca = true;
                continue;
            }
            System.out.println("Qual a quantidade de meses de aluguel ? ");
            Integer quantMeses = sc.nextInt();
            sc.nextLine();
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
        } while (semMarca);

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
            System.out.println("Lamentamos! Na próxima teremos mais veículos!");
        }
    }*/

}