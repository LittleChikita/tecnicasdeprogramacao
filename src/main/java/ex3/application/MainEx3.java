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

package ex3.application;

import ex3.entities.Lista;
import ex3.entities.ListaOrdenada;

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
* @date 19/04/2024
* @brief Class MainEx3
 */
public class MainEx3 {
 public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(3);
        lista.inserir(1);
        lista.inserir(4);
        lista.inserir(2);
        
        System.out.println("Lista:");
        lista.exibir();  
        
        System.out.println("Quantidade de números: " + lista.quantidade());  
        
        System.out.println("Valor na posição 2: " + lista.valor(2)); 
        
        lista.remover(1);
        System.out.println("Lista após remover o número 1:");
        lista.exibir(); 
        
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        listaOrdenada.inserir(3);
        listaOrdenada.inserir(1);
        listaOrdenada.inserir(4);
        listaOrdenada.inserir(2);
        
        System.out.println("Lista Ordenada:");
        listaOrdenada.exibir(); 
        
        System.out.println("Quantidade de números na lista ordenada: " + listaOrdenada.quantidade());  
        
        System.out.println("Valor na posição 2 da lista ordenada: " + listaOrdenada.valor(2));  
        
        listaOrdenada.remover(1);
        System.out.println("Lista ordenada após remover o número 1:");
        listaOrdenada.exibir(); 
    }
}
