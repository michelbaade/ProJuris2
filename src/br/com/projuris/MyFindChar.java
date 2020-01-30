package br.com.projuris;

public class MyFindChar implements FindCharachter {

	@Override
	public char findChar(String palavra) {
		
		char[] arr = palavra.toCharArray();
		char letraNaoRepetida = arr[0];
		
		 letraNaoRepetida = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
	        
			if(arr[i] == letraNaoRepetida ) {
				
	        	
	        	
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
		
		
		
		
		return letraNaoRepetida;
	}

	public static char[] removeTheElement(char[] arr, char letra) 
	{ 

			char[] anotherArray = new char[arr.length - 2]; 

			for (int i = 0, k = 0; i < arr.length; i++) { 

				if (arr[i] == letra) { 
					continue; 
				} 

				anotherArray[k++] = arr[i]; 
				} 

			return anotherArray; 
		}

	
	


	//@Override
	//public char findChar(String word) {
		
		
		
	//	return 0;
	//}
}
