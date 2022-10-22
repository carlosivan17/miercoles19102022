package algoritmodeordenamiento;

import java.util.Scanner;

public class PorInsercion {
	
	public static void ordenamientoPorInsercion(int A[], int n) {
		for(int i = 1; i < n; i++) {
			int valorC = A[i];
			int posicion = i;
			while((posicion > 0) && (A[posicion - 1] > valorC)) {
				A[posicion] = A[posicion - 1];
				posicion = posicion -1;
			}
			A[posicion] = valorC;
		}
	}
	
	public static void mostrarArreglo(int A[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(A[i] + "");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de elementos a introducir: ");
		int n = sc.nextInt();
		int A[] = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el elemento [" + i + "] ");
			A[i] = sc.nextInt();
		}
		System.out.println("Arreglo original: ");
		
		mostrarArreglo(A, A.length);
		ordenamientoPorInsercion(A, A.length);
		
		System.out.println("Arreglo ordenado: ");
		mostrarArreglo(A, A.length);

	}

}
