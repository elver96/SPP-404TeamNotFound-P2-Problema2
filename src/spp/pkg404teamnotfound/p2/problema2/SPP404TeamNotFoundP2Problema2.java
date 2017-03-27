/*
Elver Iram Jiménez Rodríguez A01196327
Luis Mario de Leija Piñón         A01410385
Luis  Montiel Rocha                 A01410588
Pablo Serrano              A014
Rubén Daniel Baez Muñíz        A01411504
*/
package spp.pkg404teamnotfound.p2.problema2;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo1 [][];
        int numeroFilas1;
        int numeroColumnas1;
        int datoCasilla1;
        System.out.println("Ingrese el numero de filas que tendra la matris #01:");
        Scanner entradaNumeroFilas1 = new Scanner(System.in);
        numeroFilas1 = entradaNumeroFilas1.nextInt();
        System.out.println("Ingrese el numero de columnas que tendra la matris #01:");
        Scanner entradaNumeroColumnas1 = new Scanner(System.in);
        numeroColumnas1 = entradaNumeroColumnas1.nextInt();
        arreglo1 = new int [numeroFilas1][numeroColumnas1];
        for(int i = 0; i < arreglo1.length; i++){
            for (int j = 0; j < arreglo1.length; j++){
                System.out.println("Ingrese el dato que desee guardar en esta casilla:");
                Scanner entradaCasilla = new Scanner(System.in);
                datoCasilla1 = entradaCasilla.nextInt();
                arreglo1 [i][j] = datoCasilla1;
            }
        }
        int arreglo2 [][];
        int numeroFilas2;
        int numeroColumnas2;
        int datoCasilla2;
        System.out.println("Ingrese el numero de filas que tendra la matris #02:");
        Scanner entradaNumeroFilas2 = new Scanner(System.in);
        numeroFilas2 = entradaNumeroFilas2.nextInt();
        System.out.println("Ingrese el numero de columnas que tendra la matris #02:");
        Scanner entradaNumeroColumnas2 = new Scanner(System.in);
        numeroColumnas2 = entradaNumeroColumnas2.nextInt();
        arreglo2 = new int [numeroFilas2][numeroColumnas2];
        for(int i = 0; i < arreglo2.length; i++){
            for(int j = 0; j < arreglo2[i].length; j++){
                System.out.println("Ingrese el dato que se guardara en esta casilla:");
                Scanner entradaCasilla2 = new Scanner(System.in);
                datoCasilla2 = entradaCasilla2.nextInt();
                arreglo2 [i][j] = datoCasilla2;
            }
        }
        if ((numeroFilas1 != numeroFilas2) || (numeroColumnas1 != numeroColumnas2)){
            System.out.println("LAS DIMENSONES DE AMBAS MATRICES NO SON IGUALES");
            System.exit(0);
        } else {
            System.out.println("LAS DIMENSIONES DE AMBAS MATRICES SON IGUALES");
        }
        for(int i = 0; i < arreglo2.length; i++){
            for(int j = 0; j < arreglo2[i].length; j++){
                if (arreglo1 [i][j] != arreglo2 [i][j]){
                    System.out.println("NO TODOS LOS VALORES DE TODAS LAS CASILLAS DE AMBAS MATRICES SON IGUALES");
                    System.exit(0);
                } else {
                }
            }
        }
        System.out.println("LOS VALORES DE TODAS LAS CASILLAS DE AMBAS MATRICES SON IGUALES");
    }
}
