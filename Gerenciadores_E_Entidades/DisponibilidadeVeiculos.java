package Gerenciadores_E_Entidades;
import java.util.ArrayList;
import java.util.List;

public class DisponibilidadeVeiculos {

    public void veiculosDisponiveis(SelecionaModeloVeiculos selecionador) {
        Marcas carro = Marcas.HYUNDAI;
        Marcas moto = Marcas.KAWASAKI;

        String veiculoInteresse = selecionador.getVeiculoInteresse();
        Integer quantMeses = selecionador.getQuantMeses();

        List<Veiculos> veiculosDisponiveis = new ArrayList<>();

        if (veiculoInteresse.equalsIgnoreCase("CARRO")) {
            veiculosDisponiveis.add(new Veiculos("HB20", 10000, 2019));
            Veiculos veiculo = veiculosDisponiveis.get(0);

            System.out.println("Temos os seguintes modelos e a taxa de aluguel: \n" +
                    "Marca: " + carro + "\n" +
                    "Modelo: " + veiculo.getModelo() + "\n" +
                    "Quilometragem Atual: " + veiculo.getQuilometragem() + "\n" +
                    "Taxa de Aluguel: " + veiculo.taxa(carro.getValor(), quantMeses) + "\n");

        } else if (veiculoInteresse.equalsIgnoreCase("MOTO")) {
            veiculosDisponiveis.add(new Veiculos("NINJA300", 9000, 2022));
            Veiculos veiculo = veiculosDisponiveis.get(0);

            System.out.println("Temos os seguintes modelos e a taxa de aluguel: \n" +
                    "Marca: " + moto + "\n" +
                    "Modelo: " + veiculo.getModelo() + "\n" +
                    "Quilometragem Atual: " + veiculo.getQuilometragem() + "\n" +
                    "Taxa de Aluguel: " + veiculo.taxa(moto.getValor(), quantMeses) + "\n");
        }

    }
}
