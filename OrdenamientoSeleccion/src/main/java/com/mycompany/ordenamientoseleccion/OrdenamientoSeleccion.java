package com.mycompany.ordenamientoseleccion;
import java.util.Arrays;
/**
 *
 * @author Usuario
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 5, 52};
        System.out.println("Arreglo desordenado: " + Arrays.toString(datos)); // muestra el arreglo
        ordenamientoSeleccion(datos); // odena el arreglo
        System.out.println("Arreglo Ordenado: " + Arrays.toString(datos));// muestra el arreglo
    }
    
    // ordena el arreglo usando el ordenamiento por selección
    // bloque de codigoimportante
    public static void ordenamientoSeleccion(int[] datos){
        // itera a traves de datos.length - 1 elemento
        for(int i = 0; i<datos.length -1; i++){
            int masPequeño = i; // primer indice del resto del arreglo
            // itera para buscar el indice del elemento mas pequeño
            for(int indice=i+1; indice<datos.length; indice++){
                if (datos[indice]<datos[masPequeño]){
                    masPequeño = indice;
                }
            }
            intercambiar(datos, i, masPequeño); //intercambia el elemento mas pequeño en la posicion
            imprimirPasada(datos, i+1, masPequeño); // imprime la pasada del algoritmo
        }
    }// fin del metodo ordenamientoSeleccion
    
    // intercambia los datos 
    // bloque de codigoimportante
    private static void intercambiar(int[] datos, int primero, int segundo){
        int temporal = datos[primero]; // almacenamiento primero en temporal
        datos[primero] = datos[segundo]; // sustituya primero con el segundo
        datos[segundo] = temporal; // coloca temporal en segundo
    }
    
    // imprime una pasa del algoritmo
    // solo imprimelo que realizo 
    // bloque de codigo no importante
    private static void imprimirPasada(int[] datos, int pasada, int indice){
        System.out.println("despues de iteracion " + pasada + "*");
        // imprime elementos hasta el elemento seleccionado
        for(int i=0; i <indice; i++){
            System.out.print(" " + datos[i]);
        }
        System.out.print(" " + datos[indice] + "*"); // indice intercambio
        // termina de imprimir el arreglo en pantalla
        for(int i = indice + 1; i < datos.length; i++){
            System.out.print(" " + datos[i]);
        }
        System.out.print("\n "); // para alineación
        // indica la cantidad del arreglo que está ordenada
        for(int j = 0; j < pasada; j++){
            if (datos[j]< 10){
                System.out.print("- ");
            }else{
                System.out.print("-- ");
            }
        }
        System.out.println("");
    }
}
