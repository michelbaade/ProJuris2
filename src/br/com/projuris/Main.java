package br.com.projuris;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		/*Demonstra��o:
			�stress� � deve retornar �t�. �reembolsar� �
			deve retornar �m�.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a palavra para verifica��o.");
		String palavra = sc.next();
		
		MyFindChar myfind= new MyFindChar();
		
		
		System.out.println("A primeira letra n�o repetida foi a letra : "+myfind.findChar(palavra));
		
		
		sc.close();
	}
	
	

}
