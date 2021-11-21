package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // Sintaxe tipo[][] = matriz bidimenssional
										// tipo[][][]= matiz tridimenssional
										// ...
		for (int i = 0; i < n; i++) {// linhas
			for (int j = 0; j < n; j++) {// colunas
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		System.out.print(mat[0][0]);// posicao 0
		for (int i = 1; i < n; i++) {// comeca a partir da posicao 1
			System.out.print(" " + mat[i][i]);
		}
		System.out.println();
		System.out.print("Negative number =  ");
		int count = 0;//contador 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {//filtrandos os numeros negativos
					count += 1;
				}
			}
		}
		System.out.print(count);

	}

}
