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
package ex3.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 19/04/2024
 * @brief Class ListaOrdenada
 */
public class ListaOrdenada {

    private List<Integer> lista;

    public ListaOrdenada() {
        this.lista = new ArrayList<>();
    }

    public void inserir(int numero) {
        int index = Collections.binarySearch(lista, numero);
        if (index < 0) {
            index = -(index + 1);
        }
        lista.add(index, numero);
    }

    public void remover(int numero) {
        lista.remove((Integer) numero);
    }

    public int quantidade() {
        return lista.size();
    }

    public int valor(int posicao) {
        return lista.get(posicao);
    }

    public void exibir() {
        System.out.println(lista);
    }
}
