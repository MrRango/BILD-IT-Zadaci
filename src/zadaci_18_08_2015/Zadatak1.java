/*
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * the most 1s.)
 */

package zadaci_18_08_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos velicina matrice od strane korisnika
		System.out.println("Unesite n za matricu nxn");
		int n = in.nextInt();
		in.close();
		//kreiranje matrice sa unijetom velicinom
		int[][] matrix = new int[n][n];
		//unos generisanih vrijednosti u matricu i stampanje matrice
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] rows = new int[n];
		int[] columns = new int[n];
		int row = 0;
		int column = 0;
		//prolazak kroz matricu, brojanje jedinica u redovima i kolonama i smijestanje njihovog broja u niz 
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(matrix[i][j] == 1){
					row++;
				}
				if(matrix[j][i] == 1){
					column++;
				}
				//kada se dodje do kraja reda/kolone, iznos brojaca se prosljedjuje na odgovarajuca mijesta u nizovima
				if(j == n - 1){
					rows[i] = row;
					columns[i] = column;
					//resetovanje brojaca za sledeci red/kolonu
					row = 0;
					column = 0;
				}
			}
		}
		
		int rowMax = 0;
		int columnMax = 0;
		//odredjivanje koji red i koja kolona imaju najveci broj jedinica
		for(int i = 0; i < n; i++){
			if(rows[i] > rows[rowMax]){
				rowMax = i;
			}
			if(columns[i] > columns[columnMax]){
				columnMax = i;
			}
		}
		//stampanje rezultata
		System.out.println("Red sa najvise jedinica: " + rowMax);
		System.out.println("Kolona sa najvise jedinica: " + columnMax);
		
	}

}
