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
 * @brief Class PecaImportada
 */
public class PecaImportada extends Peca {

    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada() {
    }

    /**
     * @return the taxaImportacao
     */
    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    /**
     * @param taxaImportacao the taxaImportacao to set
     */
    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    /**
     * @return the taxaFrete
     */
    public float getTaxaFrete() {
        return taxaFrete;
    }

    /**
     * @param taxaFrete the taxaFrete to set
     */
    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public void calcularPreco() {
        super.calcularPreco();
        this.preco += taxaFrete + taxaImportacao;
        System.out.println("Preço: " + preco);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Taxa de Importação: " + taxaImportacao);
        System.out.println("Taxa de Frete: "+ taxaFrete);
    }
}
