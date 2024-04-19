package Exemplos_logicAlg;
import java.util.Scanner;
public class Loop_for_Java {
	
	public static void main(String[] args) {
		
		int multi = 0;
	    
	    Scanner scan = new Scanner (System.in);
	    System.out.println(" Digite um número : \n");
	    
	    int num = scan.nextInt();
	    
	    System.out.println("************A tabuada de multiplicação de " + num + "********");
	    
	    for(int i=1 ; i <=10 ; i ++){
	        
	       multi = i * num;
	       
	        
	        System.out.println( + num +  " x "  + i + " = " + multi);
	    }
		
	}
}