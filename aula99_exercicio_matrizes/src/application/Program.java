package application;

import java.util.Scanner;

/*
Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N contendo n�meros inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de n�meros negativos da matriz.*/
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //Sintaxe tipo[][] = matriz bidimenssional
											 //tipo[][][]= matiz tridimenssional
											//...			
		for (int i=0; i<n; i++) {//linhas
			for(int j=0; j<n; j++) {//colunas
				mat[i][j] = sc.nextInt();
			}
		}
	}

}
