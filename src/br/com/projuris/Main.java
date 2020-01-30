package br.com.projuris;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		/*Demonstração:
			“stress” – deve retornar “t”. “reembolsar” –
			deve retornar “m”.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a palavra para verificação.");
		String palavra = sc.next();
		
		char[] arr = palavra.toCharArray();
		
		char letraNaoRepetida = arr[0];
		double quantidadeDeTrocas = 0;
		
		
		for (int i = 1; i < arr.length; i++) {
	        
			if(arr[i] == letraNaoRepetida ) {
				
	        	quantidadeDeTrocas = quantidadeDeTrocas + 1.0;
	        	
	        	
	        	if(letraNaoRepetida == arr[0]) {
	        		arr = removeTheElement(arr, letraNaoRepetida);
	        		
	        		if(arr.length != 0) {
	        			
	        			letraNaoRepetida = arr[0] ;
	        		
	        		}else {
	        			letraNaoRepetida = ' ';
	        		}
	        	}else if(letraNaoRepetida == arr[0] && arr != null) {
	        		
	        		letraNaoRepetida = arr[0] ;
	        			
	        		
	        		
	        	}
	        	
	        		i = 0;
	        }
			
			
		}
		
		System.out.println("A primeira letra não repetida foi a letra : "+letraNaoRepetida);
		
		
		sc.close();
	}
	
	public static char[] removeTheElement(char[] arr, char index) 
{ 

		char[] anotherArray = new char[arr.length - 2]; 

		for (int i = 0, k = 0; i < arr.length; i++) { 

			if (arr[i] == index) { 
				continue; 
			} 

			anotherArray[k++] = arr[i]; 
			} 

		return anotherArray; 
	}
	
	

}
