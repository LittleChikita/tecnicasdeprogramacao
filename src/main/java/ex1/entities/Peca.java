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
package ex1.entities;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 19/04/2024
 * @brief Class Peca
 */
public class Peca {

    private String nome;
    private float custo;
    private float lucro;
    float preco;

    public Peca() {
        this.nome = " ";
        this.preco = 0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * @return the lucro
     */
    public float getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public void calcularPreco() {
        this.preco = custo + lucro;
    }

    public void exibir() {
        System.out.println("Nome da peça: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
    }

}
