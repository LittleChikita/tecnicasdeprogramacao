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
  * Esta é a classe abstrata Veiculo, que serve como uma classe base para os tipos de veículos.
 * Ela possui propriedades comuns a todos os veículos, como placa e ano, e métodos para manipulá-las.
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
* @date 17/03/2024
* @brief Class Veiculo
 */
public abstract class Veiculo {
     // Propriedades de um veículo
    private String placa;  // A placa do veículo
    private int ano; // O ano de fabricação do veículo
    
    // Construtores
    public Veiculo() {
        // Construtor padrão vazio
    }
    
    // Construtor com parâmetros para definir a placa e o ano do veículo
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    
     // Métodos de acesso para a propriedade 'placa'
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    // Métodos de acesso para a propriedade 'ano'
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public int getAno(){
        return ano;
    }
    
      // Método toString para representar o veículo como uma string
    @Override
    public String toString(){
        return "Veiculo [placa=" + placa + "]" + "Ano [ano=" + ano + "]";
    }
}