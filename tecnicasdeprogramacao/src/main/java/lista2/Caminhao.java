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

/**
 * Classe que representa um caminhão, estendendo a classe abstrata Veiculo. Um
 * caminhão possui propriedades adicionais, como o número de eixos.
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 17/03/2024
 * @brief Class Caminhao
 */
public class Caminhao extends Veiculo {
    // Propriedade específica de um caminhão

    private int eixos;

    // Construtores
    // Construtor com parâmetros para definir a placa, o ano e o número de eixos do caminhão
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); // Chama o construtor da classe base (Veiculo) para definir a placa e o ano
        this.eixos = eixos; // Define o número de eixos do caminhão
    }

    // Construtor padrão vazio
    public Caminhao() {
    }

    // Métodos de acesso para a propriedade 'eixos'
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    // Método toString para representar o caminhão como uma string
    @Override
    public String toString() {
        // Retorna uma string que inclui o número de eixos, a placa e o ano do caminhão
        return "Caminhao [eixos=" + eixos + ", placa=" + getPlaca() + ", ano=" + getAno() + "]";
    }
}
