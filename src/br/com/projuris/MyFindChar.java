package br.com.projuris;

public class MyFindChar implements FindCharachter {

	@Override
	public char findChar(String palavra) {
		//conversão da palavra para um array de letras(char)
		char[] arr = palavra.toCharArray();
		// variavel que vai guardar qual a letra não foi repetida
		char letraNaoRepetida = arr[0];
		
		//for para percorrer toda a verificação de caso for a mesma letra, discartar e seguir para a próxima
		for (int i = 1; i < arr.length; i++) {
	        
			if(arr[i] == letraNaoRepetida ) {
				
	        	
	        	
	        	if(letraNaoRepetida == arr[0]) {
	        		// chamada da função para remover as letras repetidas
	        		arr = removeTheElement(arr, letraNaoRepetida);
	        		
	        		//condicional para saber se ainda tem alguma letra
	        		if(arr.length != 0) {
	        			
	        			letraNaoRepetida = arr[0] ;
	        		
	        		}
	        		// caso não tenha nenhuma letra será retornado ' '
	        		else {
	        			letraNaoRepetida = ' ';
	        		}
	        	}else if(letraNaoRepetida == arr[0] && arr != null) {
	        		
	        		letraNaoRepetida = arr[0] ;
	        			
	        		
	        		
	        	}
	        	// i recebendo 0 para recomeçar e ver todos os itens a seguise possuem a mesma letra
	        		i = 0;
	        }
			
			
		}
		
		
		
		//retorno da letra
		return letraNaoRepetida;
	}
//função para remover as letras correspondentes
	public static char[] removeTheElement(char[] arr, char letra) 
	{ 

			char[] anotherArray = new char[arr.length - 2]; 

			for (int i = 0, k = 0; i < arr.length; i++) { 

				if (arr[i] == letra) { 
					continue; 
				} 

				anotherArray[k++] = arr[i]; 
				} 
			// retornando um novo array só que sem as letras iguais
			return anotherArray; 
		}

}
