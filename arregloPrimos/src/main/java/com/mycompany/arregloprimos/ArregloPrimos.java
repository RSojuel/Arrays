/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arregloprimos;

/**
 *
 * @author Usuario
 */
public class ArregloPrimos {

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void llenarMatriz() {
        int matriz[][] = new int[3][3];
        int ultimoPrimo = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int n = ultimoPrimo; n < 100; n++) {
                    if (esPrimo(n)) {
                        matriz[i][j] = n;
                        ultimoPrimo = n + 1;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        llenarMatriz();
    }
}
