package Ex.Break;

import java.util.Scanner;

// programa que exibe o valor mais proximo multiplo de 07.

public class BreakComand {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um número limite");
		
		int max = scan.nextInt();
		
		for(int i = num; i<=max; i++) {
			
			if(i % 7 ==0 ) {
				
				System.out.println("O valor multiplo de 7 mais proximo de " +num+ "é : " + i);
				break;
				
			}
		}
		
		
		
	}

}
