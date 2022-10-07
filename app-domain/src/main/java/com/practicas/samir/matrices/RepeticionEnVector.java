package com.practicas.samir.matrices;

public class RepeticionEnVector {

	// cuales son las veces que se repite un numero en un vector
	public static void main(String[] args) {

		int[] arreglo = { 1, 2, 2, 3, 4, 3, 5, 5 };
		int[] contador = new int[6];

		for (int i = 0; i < arreglo.length; i++) {
			contador[arreglo[i]] += 1;

		}
		for (int j = 0; j < contador.length; j++) {
			System.out.println("calificacion " + j + " : " + contador[j] + " veces");

		}

	}

}
