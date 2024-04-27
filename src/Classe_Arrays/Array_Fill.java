package Classe_Arrays;

import java.util.Arrays;

/// Classe para preencher um vetor

public class Array_Fill {
	
	public static void main(String[] args) {
		
	int v[] = new int [20];
	
	// int x[] = {0,0,0,0,0,0,0..}, colocar zero 10 ou 500 vezes pode ser trabalhoso
	
	Arrays.fill(v, 0); // prenchendo o mue vetor v com 20 valores de 0
	
	for (int valor: v) {
		
		System.out.print(valor + "");
	}
	}

}
