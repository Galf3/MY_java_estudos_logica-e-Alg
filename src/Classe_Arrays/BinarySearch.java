package Classe_Arrays;

import java.util.Arrays;

/// A POSIÇÃO DE UM ELEMENTO DO VETOR


public class BinarySearch {
	
	public static void main(String[] args) {
		
		int vet [] = {3,7,6,1,9,4,2};
		
		for (int v : vet) {
			
			System.out.print(v);
		}
		
		System.out.println();
		int p = Arrays.binarySearch(vet, 1);
		System.out.println("Encontrei o valor na posição " + p);
	}

}
