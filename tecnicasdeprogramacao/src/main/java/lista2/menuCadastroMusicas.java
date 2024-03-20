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

/**
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
 * @date 17/03/2024
 * @brief Class menuCadastroMusicas
 */
public class menuCadastroMusicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Musicas musica = new Musicas();
        Compositores compositor = new Compositores();

        System.out.println("Qual o nome da Música?");
        musica.setNomeDaMusica(sc.nextLine());
        System.out.println("Qual o tipo da Música?");
        musica.setTipoDaMusica(sc.nextLine());
        System.out.println("Qual o ano em que foi lançada?");
        musica.setAno(sc.nextInt());

        sc.nextLine();

        System.out.println("Qual compositor da Música?");
        compositor.setNomeDoCompositor(sc.nextLine());
        System.out.println("Qual a nacionalidade do Compositor?");
        compositor.setNacionalidade(sc.nextLine());
        
        System.out.println("Dados da Música:");
        System.out.println("Nome: " + musica.getNomeDaMusica());
        System.out.println("Tipo: " + musica.getTipoDaMusica());
        System.out.println("Ano: " + musica.getAno());

        System.out.println("\nDados do Compositor:");
        System.out.println("Nome: " + compositor.getNomeDoCompositor());
        System.out.println("Nacionalidade: " + compositor.getNacionalidade());

    }
}
