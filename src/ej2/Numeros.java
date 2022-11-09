package ej2;

import java.util.Arrays;

public class Numeros {
    private int[] listaNums;

    public void setNumeros(int[] input) {
        listaNums = input;
    }

    public int longitud() {
        return listaNums.length;
    }

    public int mayor() {
        int t = Integer.MIN_VALUE;
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] > t) {
                t = listaNums[i];
            }
        }
        return t;
    }

    public int menor() {
        int t = Integer.MAX_VALUE;
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] < t) {
                t = listaNums[i];
            }
        }
        return t;
    }

    public int media() {
        int t = 0;
        for (int i = 0; i < listaNums.length; i++) {
            t = t + listaNums[i];
        }
        if (listaNums.length == 0) {
            return 0;
        } else {
            return (t / listaNums.length);
        }
    }

    public int mediana() {
        int[] temp = listaNums.clone();
        Arrays.sort(temp);
        int res;
        if (temp.length % 2 == 0) {
            res = (temp[(temp.length / 2)] + temp[(temp.length / 2) - 1]) / 2;
        } else
            res = temp[temp.length / 2];
        return res;
    }

    // Ejercicio 2
    public int[] getOrdenado() {

        int[] temp = listaNums.clone();
        Arrays.sort(temp);
        return temp;
    }

    // Ejercicio 2
    public int[] getPares() {
        int[] temp;
        int n = 0;
        int contador = 0;
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] % 2 == 0) {
                contador++;
            }
        }
        temp = new int[contador];
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] % 2 == 0) {
                temp[n] = listaNums[i];
                n++;
            }
        }
        return temp;
    }

    // Ejercicio 2
    public int[] getImpares() {
        int[] temp;
        int n = 0;
        int contador = 0;
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] % 2 != 0) {
                contador++;
            }
        }
        temp = new int[contador];
        for (int i = 0; i < listaNums.length; i++) {
            if (listaNums[i] % 2 != 0) {
                temp[n] = listaNums[i];
                n++;
            }
        }
        return temp;
    }

}