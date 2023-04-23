package ejercicio_1;

import java.util.Arrays;

public class Ejercicio_1_Main {

    public static void main(String[] args) {

        System.out.println(noEsLaborable2(6));

        System.out.println(multiplicarInfinitamente(2,5,50,90,2,75));


    }

    //1. Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.

    //En esta funcion si introduces el dia de la semana 6 o 7 (Sabado o domingo) te dara true,
    //si introduces otro numero dara false
    public static boolean noEsLaborable2(int dia){
        return (dia > 5 && dia < 8);
    }


    //Esta funcion multiplica todos los numeros que introduzcas
    public static int multiplicarInfinitamente(int ...numeros) {
        int resultado = 1;

        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

}
