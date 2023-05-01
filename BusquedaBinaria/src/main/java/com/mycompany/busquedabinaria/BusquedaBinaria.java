/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedabinaria;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class BusquedaBinaria {

    public static void main(String[] args) {
        int [] datos = {2, 3, 5, 10, 27, 30, 34, 51, 56, 65, 77, 81, 82, 93, 99}; // Inicializamos el array
        Arrays.sort(datos); // busquedaBinaria requiere un arreglo
        System.out.printf("%s%n%n", Arrays.toString(datos)); // muestra el arreglo
        int enteroABuscar = 81;
        // realiza la busqueda
                                    //arreglo,  enteroABuscar
        int posicion = busquedaBinaria(datos, enteroABuscar);
        if (posicion == -1) // no lo encontro
        {
            //System.out.printf("%d no se encontro%n%n",enteroABuscar);
            System.out.println("No se encontro "+enteroABuscar);
        }else // lo encontró
        {
            System.out.printf("%d se encontro en la posicion %d%n%n",enteroABuscar, posicion);
        }
    }
    
    // realiza una busqueda binaria en los datos
    public static int busquedaBinaria(int[] datos, int clave){
        int inferior = 0; // extremo inferior del area de busqueda
        int superior = datos.length -1; // extremo superior del area de busqueda
        int medio = (inferior + superior + 1)/ 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontró
        do // ciclo para buscar un elemento
        {
            // imprime el resto de los elementos del arreglo
            System.out.print(elementosRestantes(datos, inferior, superior));
            // imprime espacios para alineación
            for(int i = 0; i < medio; i++){
                if (datos[i] < 10){
                    System.out.print("  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" * "); // indica el elemento medio actual
            // si el elemento se encuentra en medio
            if(clave == datos[medio]){
                ubicacion = medio; // la ubicacion es el elemeto medio actual
            }else if (clave < datos[medio]) // elimina o descarta la mitad superior
            {
                superior = medio -1; // elimina o descarta la mitad superior
            }else // el elemto medio es demaciado bajo
            {
                inferior = medio + 1;  // elimina o descarta la mitad inferior
            }
            medio = (inferior + superior + 1) /2; // recalcula el elemto medio
        }while((inferior <= superior) && (ubicacion == -1));
        return ubicacion;
    } // fin del metodo busquedaBinaria
    
    // metodo para imprimir ciertos valores en el arreglo
    // no hace busqueda unicamente imprime la mitad de el arreglo que contiene el valor a buscar
    private static String elementosRestantes(int[] datos, int inferior, int superior){
        StringBuilder temporal = new StringBuilder();
        
        // imprime espacios para la alineacion
        for(int i = 0; i < inferior; i++){
            if (datos[i] < 10){
                System.out.print("  ");
            }else{
                System.out.print("   ");
            }
        }
        // imprime los elemetos que quedan en el arreglo
        for(int i = inferior; i <= superior; i++){
            temporal.append(datos[i]).append(" ");
        }
        return String.format("%s%n", temporal);
    }// fin del metodo elementosRestantes
}
