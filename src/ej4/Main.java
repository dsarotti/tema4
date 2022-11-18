package ej4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Numeros obj1 = new Numeros();
        Numeros obj2 = new Numeros();
        Numeros obj3 = new Numeros();
        Numeros obj4 = new Numeros();
         int[] test={0,1,2,3,4,5,6,7,8,9};
         obj1.setNumeros(test);

         int [] test2={0,1};
         obj2.setNumeros(test2);
        System.out.println("Longitud: " + obj1.longitud());
        System.out.println("Mayor: " + obj1.mayor());
        System.out.println("Menor: " + obj1.menor());
        System.out.println("Media: " + obj1.media());
        System.out.println("Mediana: " + obj1.mediana());
        System.out.println("Ordenado: " + Arrays.toString(obj1.getOrdenado()));
        System.out.println("Pares: " + Arrays.toString(obj1.getPares()));
        System.out.println("Impares: " + Arrays.toString(obj1.getImpares()));
        System.out.println("Cuenta primos: " + obj1.cuentaPrimos());
        System.out.println("Muestra primos: " + Arrays.toString(obj1.getPrimos()));
/*
        System.out.println("----------Inserciones--------");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("pos 0, valor 9: ");
        obj1.insertarPos(9, 0);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("pos 1, valor 6: ");
        obj1.insertarPos(6, 1);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("pos 0, valor 1: ");
        obj1.insertarPos(1, 0);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("pos 13, valor 5: ");
        obj1.insertarPos(5, 13);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        // --------------------------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------------------");
        //
        System.out.println("Principio: valor 8");
        obj1.insertarPrincipio(8);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("Principio: valor 3");
        obj1.insertarPrincipio(3);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("Final: valor 0");
        obj1.insertarFinal(0);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("ELIMINACIONES");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("EliminaPos 0");
        obj1.eliminarPos(0);
        System.out.println("Resultado: " + Arrays.toString(obj1.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println(" TEST 2º OBJETO: ARRAY INICIAL DE 2 POSICIONES. ARRAY INICIAL: {0,1}");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("InsertarPos (3,0)");
        obj2.insertarPos(3, 0);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("InsertarPos(4,3)");
        obj2.insertarPos(4, 3);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("---------------------ELIMINACIONES------------------");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("eliminaPos(3)");
        obj2.eliminarPos(3);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("eliminarPos(0)");
        obj2.eliminarPos(0);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("EliminarPos(1)");
        obj2.eliminarPos(1);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("EliminarPos(0)");
        obj2.eliminarPos(0);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("--------EL OBJETO ESTA VACIO, INSERTANDO UN ELEMENTO EN pos 0----------");
        obj2.insertarPrincipio(0);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("insertarPrincipio(1)");
        obj2.insertarPrincipio(1);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("eliminarPos(1)");
        obj2.eliminarPos(1);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("eliminarPos(1)");
        obj2.eliminarPos(0);
        System.out.println("Resultado: " + Arrays.toString(obj2.getNumeros()));
        System.out.println("            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
        //
        System.out.println("-----------------------------------------------");
        System.out.println("getNumeros lista vacia> " + Arrays.toString(obj3.getNumeros()));
        */
    }
}