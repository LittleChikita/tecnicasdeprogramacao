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
 *
 * @author Josias Junior Santos  <josiajrsantos@gmail.com>
* @date 03/03/2024
* @brief Class Ex15
 */
import java.util.Scanner;
public class Ex15 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz quadrada: ");
        int ordem = sc.nextInt();

        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal da Matriz:");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
