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
package ex1.application;

import ex1.entities.Peca;
import ex1.entities.PecaImportada;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 19/04/2024
 * @brief Class MainEx1
 */
public class MainEx1 {

    public static void main(String[] args) {
        Peca peca = new Peca();
        PecaImportada peca2 = new PecaImportada();
        
        peca.setNome("Homocinética");
        peca.setCusto(10);
        peca.setLucro(2);
        peca.exibir();
        peca.calcularPreco();
        
        peca2.setNome("DiscoDeFreio");
        peca2.setCusto(10);
        peca2.setLucro(10);
        peca2.setTaxaFrete(5);
        peca2.setTaxaImportacao(20);
        peca2.exibir();
        peca2.calcularPreco();
    }
}
