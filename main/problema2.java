// Tienes una calculadora en la que escribes un número y un espejo vertical en el que puedes reflejarlo:

// Algunas veces el número escrito y el reflejado son el mismo (algunas veces no y otras veces lo que 
// se refleja ni siquiera es un número). Escribe un programa que, dados dos enteros m y n,
// encuentre la cantidad r de enteros en el intervalo de m a n (incluyéndolos a ambos) que sean
// iguales a sus números reflejados en el espejo. Por ejemplo, si m = 7 y n = 12 entonces r = 2
// puesto que los números 8 y 11 son iguales a sus números reflejados en el espejo. Observa que
// el número 12851 también es igual a su número reflejado en el espejo.

// Entrada: Dos números enteros m y n con 0 ≤ m ≤ n ≤ 999,999,999.
// Salida: Un número entero r y números que son iguales a los reflejados.

// Entrada:                Salida
// 7     12                  2  -->  8, 11

package main;

import java.util.Scanner;

public class problema2 {

    public static boolean IsInteger(String text) {
        int v;
        try {
            // Convierte la cadena de texto en un valor entero
            v = Integer.parseInt(text);
            if (v < 999999999) {
                return true;
            } else {
                return false;
            }

            // Si el usuario ingreso un caracter devuelve un false
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean IsInteger2(String text) {
        int v;
        try {
            // Convierte la cadena de texto en un valor entero
            v = Integer.parseInt(text);
            if (v > 0) {
                return true;
            } else {
                return false;
            }
            // Si el usuario ingreso un caracter devuelve un false
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String num = "", valores = "";
        int r = 0, n = 0, m = 0;
        String espejo = "", espejito = "";
        String n1;

        System.out.print("Ingrese el primer número del rango a analizar: ");
        n1 = read.next();
        // Validamos que el dato ingresado por el usuario sea un entero
        while (!IsInteger(n1)) {
            System.out.print(
                    "El valor ingresado no es un entero o esta fuera del rango\n\nIntente nuevamente: ");
            n1 = read.next();
        }
        n = Integer.parseInt(n1);

        System.out.print("Ingrese el segundo número del rango a analizar: ");
        n1 = read.next();
        // Validamos que el dato ingresado por el usuario sea un entero
        while (!IsInteger2(n1)) {
            System.out.println(
                    "El valor ingresado no es un entero o es menor a cero\n\nIntente nuevamente: ");
            n1 = read.next();
        }
        m = Integer.parseInt(n1);
        while (m < n) {
            System.out.println(
                    "\n\tLos primeros valores fueron ingresados erroneamente\nEl segundo valor es menor al primero\nIntenta nuevamente");
            System.out.print("Ingrese el primer número del rango a analizar: ");
            n1 = read.next();
            // Validamos que el dato ingresado por el usuario sea un entero
            while (!IsInteger(n1)) {
                System.out.print(
                        "El valor ingresado no es un entero o esta fuera del rango\n\nIntente nuevamente: ");
                n1 = read.next();
            }
            n = Integer.parseInt(n1);

            System.out.print("Ingrese el segundo número del rango a analizar: ");
            n1 = read.next();
            // Validamos que el dato ingresado por el usuario sea un entero
            while (!IsInteger2(n1)) {
                System.out.println(
                        "El valor ingresado no es un entero o es menor a cero\n\nIntente nuevamente: ");
                n1 = read.next();
            }
            m = Integer.parseInt(n1);
        }

        int[] number = new int[5000000];

        for (int i = n; i <= m; i++) {
            number[i] = (i + 1) - 1;
            num += number[i] + " ";
        }
        char[] caracter = num.toCharArray();
        char[] caracter2 = num.toCharArray();

        for (int i = 0; i < caracter.length; i++) {
            espejito += caracter2[i];
        }

        String[] tokens = espejito.split(" ");
        String[] numbers = new String[tokens.length];

        // Asigna los tokens al array
        for (int j = 0; j < tokens.length; j++) {
            numbers[j] = tokens[j];
        }

        System.out.println("  ");

        char[] cambio = { '0', '1', '5', 'E', 'µ', '2', 'd', '┌', '8', 'P' };

        for (int i = 0; i < caracter.length; i++) {
            if (caracter[i] == '9') {
                caracter[i] = cambio[9];
            } else if (caracter[i] == '8') {
                caracter[i] = cambio[8];
            } else if (caracter[i] == '7') {
                caracter[i] = cambio[7];
            } else if (caracter[i] == '6') {
                caracter[i] = cambio[6];
            } else if (caracter[i] == '5') {
                caracter[i] = cambio[5];
            } else if (caracter[i] == '4') {
                caracter[i] = cambio[4];
            } else if (caracter[i] == '3') {
                caracter[i] = cambio[3];
            } else if (caracter[i] == '2') {
                caracter[i] = cambio[2];
            } else if (caracter[i] == '1') {
                caracter[i] = cambio[1];
            } else if (caracter[i] == '0') {
                caracter[i] = cambio[0];
            }
        }
        for (int i = 0; i < caracter.length; i++) {
            espejo += caracter[i];
        }

        // Divide la cadena en tokens
        String[] tokens2 = espejo.split(" ");
        String[] numbers2 = new String[tokens2.length];
        String[] espejos = new String[tokens2.length];
        // Asigna los tokens al array
        for (int j = 0; j < tokens2.length; j++) {
            numbers2[j] = tokens2[j];
        }
        System.out.println("  ");
        for (int j = 0; j < espejos.length; j++) {
            espejos[j] = new StringBuilder(numbers2[j]).reverse().toString();
        }
        for (int i = 0; i < espejos.length; i++) {
            if (espejos[i].equals(numbers[i])) {
                r++;
                valores += espejos[i] + ", ";
            }
        }
        System.out.println("La cantidad de valores que son iguales a los reflejados son: " + r
                + " \n\nY los valores son --> " + valores);
        read.close();
    }

}
