package Gerenciadores_E_Entidades;

import java.util.Scanner;

public class SelecionaModeloVeiculos {
    
    private Integer quantMeses;
    private String veiculoInteresse;
    Scanner sc = new Scanner(System.in);

    public String selecaoTipoVeiculo() {
        
        boolean semMarca = false;
            do {
                try {
                    System.out.println("Você deseja um Carro ou uma Moto? \n");
                    veiculoInteresse = sc.nextLine().toUpperCase();

                    if (!veiculoInteresse.equals("CARRO") && !veiculoInteresse.equals("MOTO")) {
                        throw new IllegalArgumentException("Opção inválida! Digite CARRO ou MOTO.");
                    }
                    quantMeses();
                    semMarca = false;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    semMarca = true;
                }
            } while (semMarca);
            return veiculoInteresse;
        }

        public Integer quantMeses(){
            System.out.println("Qual a quantidade de meses de aluguel ? ");
            quantMeses = sc.nextInt();
            sc.nextLine();
            return quantMeses;

        }

        public String getVeiculoInteresse() {
            return veiculoInteresse;
        }

        public Integer getQuantMeses() {
            return quantMeses;
        }
        
}
