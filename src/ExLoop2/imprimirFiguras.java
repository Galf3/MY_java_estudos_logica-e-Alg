package ExLoop2;


// Impressão de padrões: Escreva um programa que imprima os seguintes padrões usando laços for:
// *
//	**
//	***
//	****
//	*****


public class imprimirFiguras {
	
public static void main(String[] args) {
	    
	    String astec = " ";
	    
	    for (int i = 1; i <=5 ; i++){
		    
		    switch (i){
		     
		     case 1 : 
		         
		         astec = "*";
		         break;
		     
		     case 2 : 
		         
		         astec = "**";
		         break;
		     
		     case 3 : 
		         
		         astec = "***";
		       break;
		     case 4 : 
		         astec = "*****";
		           break;
		    
		     case 5 :
		         astec = "******";
		          break;
		    }
		    
		    System.out.println(astec);
		}
		

}

}
