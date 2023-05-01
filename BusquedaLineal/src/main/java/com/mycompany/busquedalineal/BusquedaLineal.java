/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedalineal;

/**
 *
 * @author Usuario
 */
public class BusquedaLineal {

    public static void main(String[] args) {
        int [] datos = {34, 56, 2, 10, 77, 51, 93, 30, 5, 52}; // Inicializamos el array
        int posicion = busquedaLineal(datos, 52); // realiza busqueda
        if (posicion > 0){
            System.out.println("El indice en el cual se encuentra la clave de busqueda es: " + posicion);
        }else{
            System.out.println("La clave de busquead no se enecuentra en el Array");
        }
    }
    // realiza una busqueda lineal en los datos
    public static int busquedaLineal(int [] datos, int claveBusqueda){
        // itera a través del arreglo en forma secuencial
        for(int indice = 0; indice < datos.length; indice++){
            if(datos[indice] == claveBusqueda){
                return indice ; // devuelve el indice del entero
            }
        }
        return -1;
    }// fin del metodo busquedaLineal
}
