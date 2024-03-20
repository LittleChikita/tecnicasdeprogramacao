/*
 * Copyright (C) 2024 Josias Junior Santos  <josiajrsantos@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lista2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
  * Classe que representa o menu de interação com veículos.
 * Permite ao usuário cadastrar, excluir, editar ou sair.
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 17/03/2024
 * @brief Class MenuVeiculos
 */
public class MenuVeiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        
        // Inicializa os objetos de ônibus e caminhão
        
        Onibus onibus = new Onibus();
        Caminhao caminhao = new Caminhao();

        boolean sair = false; // Define a lógica para encerrar o programa quando a opção "Sair" for selecionada

        while (!sair) { // Utiliza a lógica while para criar o menu
            System.out.println("1- Cadastrar Veiculo");
            System.out.println("2- Excluir Veiculo");
            System.out.println("3- Editar Veiculo");
            System.out.println("4- Sair");
            int opcao = sc.nextInt();  // Lê a opção digitada pelo usuário

            switch (opcao) {  // Utiliza a lógica switch para cada opção do menu
                case 1:
                    System.out.println("Qual o tipo de  Veiculo? 1- Onibus 2-Caminhao");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        // Cadastra um ônibus
                        System.out.println("Qual a placa do Veiculo?");
                        onibus.setPlaca(sc.next());
                        System.out.println("Qual o ano do Veiculo?");
                        onibus.setAno(sc.nextInt());
                        System.out.println("Quantos assentos o Veiculo tem?");
                        onibus.setAssentos(sc.nextInt());
                        veiculos.add(onibus);
                    } else if (tipo == 2) {
                        // Cadastra um caminhão
                        System.out.println("Qual a placa do Veiculo?");
                        caminhao.setPlaca(sc.next());
                        System.out.println("Qual o ano do Veiculo?");
                        caminhao.setAno(sc.nextInt());
                        System.out.println("Quantos eixos o Veiculo tem?");
                        caminhao.setEixos(sc.nextInt());
                        veiculos.add(caminhao);
                    }
                    break;
                case 2:
                    // Exclui um veículo
                    System.out.println("Qual veiculo deseja excluir?");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Índice: " + i);
                        System.out.println(veiculos.get(i));
                        System.out.println();
                    }
                    int veiculoExcluir = sc.nextInt();
                    if (veiculoExcluir >= 0 && veiculoExcluir < veiculos.size()) {
                        veiculos.remove(veiculoExcluir);
                    }
                    break;
                case 3:
                    // Edita um veículo
                    System.out.println("Qual veiculo deseja editar?");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Índice: " + i);
                        System.out.println(veiculos.get(i));
                        System.out.println();
                    }
                    int veiculoEditar = sc.nextInt();
                    if (veiculoEditar >= 0 && veiculoEditar < veiculos.size()) {
                        Veiculo veiculoSelecionado = veiculos.get(veiculoEditar);
                        if (veiculoSelecionado instanceof Onibus) {
                            Onibus onibusEditar = (Onibus) veiculoSelecionado;
                            System.out.println("Qual a nova placa do Veiculo?");
                            onibusEditar.setPlaca(sc.next());
                            System.out.println("Qual o novo ano do Veiculo?");
                            onibusEditar.setAno(sc.nextInt());
                            System.out.println("Quantos assentos o Veiculo tem?");
                            onibusEditar.setAssentos(sc.nextInt());
                            System.out.println("Veículo editado com sucesso!");
                        } else if (veiculoSelecionado instanceof Caminhao) {
                            Caminhao caminhaoEditar = (Caminhao) veiculoSelecionado;
                            System.out.println("Qual a nova placa do Veiculo?");
                            caminhaoEditar.setPlaca(sc.next());
                            System.out.println("Qual o novo ano do Veiculo?");
                            caminhaoEditar.setAno(sc.nextInt());
                            System.out.println("Quantos eixos o Veiculo tem?");
                            caminhaoEditar.setEixos(sc.nextInt());
                            System.out.println("Veículo editado com sucesso!");
                        }
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    // Encerra a execução
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida."); 
                    break;
            }
        }
    }
}
