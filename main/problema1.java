// Problema 1:
// En bioinformática, los aminoácidos son formados a partir de 
// tripletas de nucleótidos a los cuales se les llama codones. 
// Cada tripleta que forma un aminoácido para todas las combinaciones 
// posibles, recibe un nombre y a esto es lo que se le conoce como código genético. 
// Dicho código, al ser codificado como cadena puede contener solamente las 
// letras A, C, G y T. En el laboratorio se han mezclado por accidente 
// secuencias de códigos genéticos con otros tipos de códigos que por el
// momento no nos interesan. Dichos códigos están formados por todas las letras 
// del alfabeto menos la A, C, G y T. A pesar de la mezcla, en ocasiones es 
// posible recuperar la secuencia de código genético siempre que se mantenga la 
// propiedad de que sea posible formar tripletas y sólo estén involucradas las 
// letras A, C, G y T. Las demás letras pueden ser eliminadas. Escribe un programa 
// que, dada una secuencia alterada, encuentre la cantidad t de tripletas formadas 
// correctamente y la cantidad f de letras que falten para formar un correcto código 
// genético.

// Entrada: Una cadena de n letras mayúsculas, con 1 ≤ n ≤ 1,000,000.
// Salida: Un número entero t y un número entero f.

// Entrada:                                                    Salida
// GATSWACQAERYCAKOPCACT                                       4    0
/*
 * GAT       
 * ACT
 * ACC
 * ACA
 */
// GATSWACQAERYCAKOPCAN                                       3    1

/*
 * GAT   
 * ACA
 * CAC
 * AC
 */

package main;

import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cadena = "";

        System.out.println("Ingrese la cadena de letras: ");
        cadena = read.next().toUpperCase();
        read.close();

        char[] caracter = cadena.toCharArray();
        int i = 0, a = 0, c = 0, g = 0, t = 0, tripletas = 0, f = 0;

        for (i = 0; i < caracter.length; i++) {
            if (caracter[i] == 'A') {
                a++;
            } else if (caracter[i] == 'C') {
                c++;
            } else if (caracter[i] == 'T') {
                t++;
            } else if (caracter[i] == 'G') {
                g++;
            }
        }

        double tot = a + c + g + t;
        tot = tot / 3;
        int total = a + c + g + t;
        tripletas = total / 3;

        System.out.println(tot % 3);

        double diferencia = tot - Math.floor(tot);

        if (diferencia > 0.5) {
            f++;
        } else if (diferencia > 0.3) {
            f += 2;
        }

        System.out.println("La cantidad de tripletas encontradas es: " + tripletas
                + " y las letras que faltan para formar un correcto código genético son: " + f);

    }

}
