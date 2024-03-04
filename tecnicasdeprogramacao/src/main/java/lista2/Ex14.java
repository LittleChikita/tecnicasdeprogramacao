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
* @brief Class Ex14
 */
public class Ex14 {
public static void main(String[] args) {
         int limite = 1000;
        int contadorPrimos = 0;

        for (int numero = 2; numero <= limite; numero++) {
            boolean Primo = true;
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    Primo = false;
                    break;
                }
            }
            if (Primo) {
                contadorPrimos++;
            }
        }
        System.out.println("A quantidade de números primos entre 1 e 1000 é: " + contadorPrimos);
    }
}
