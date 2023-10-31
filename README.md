# ejemplos_java_30_10_23

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
