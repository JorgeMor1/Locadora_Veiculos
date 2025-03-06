package Gerenciadores_E_Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorVeiculos extends Veiculos {
    public GerenciadorVeiculos(){
    }

    public GerenciadorVeiculos(String marca, String modelo, Integer quilometragem, Integer anoVeiculo){
        super(marca, modelo, quilometragem, anoVeiculo);

    }

    /*
     * String marca,
     * String modelo,
     * Integer quilometragem,
     * Integer anoVeiculo
     */

    public void cadastraVeiculo() {
        Scanner sc = new Scanner(System.in);
        List<Object> veiculos = new ArrayList<>();
        
        System.out.print("Digite o nome da marca de seu veículo: ");
        veiculos.add(sc.nextLine());
        System.out.print("Digite o nome do modelo do seu veículo: ");
        veiculos.add(sc.nextLine());
        System.out.print("Digite a quilometragem atual do veículo: ");
        veiculos.add(sc.nextInt());
        System.out.print("Digite o ano do veículo: ");
        veiculos.add(sc.nextInt());

        System.out.println("Veículo cadastrado com sucesso!");

        sc.close();
    }
}
