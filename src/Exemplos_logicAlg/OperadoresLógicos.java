package Exemplos_logicAlg;



public class OperadoresLógicos {
	
	public static void main(String[] args) {
		
		boolean res;
		
		
		  //////////// ***** NEGAÇÃO NOT  ***********//////////
		
		res = ! (( 4+ 3 ) != 17);  // negando toda expressão e atribuindo a variavel res
		
		// equivale a expressão NOT( 4 + 3) é diferente de 17
		
		System.out.println (res);
		
		System.out.println();
		
		 //////////// ***** CONJUNÇÃO AND  ***********//////////
		
		res = ! (( 4+ 3 ) != 17); 
		System.out.println ("primeiro = " + res);
		res = (4>3) && (4 != 2);
		
		System.out.println(" segunda = " + res);
		
		
		
		
		
		
		
		
		
	}

}
