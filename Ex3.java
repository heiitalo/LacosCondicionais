package br.com.lacosdecisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é infantil. ");
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é Juvenil. ");
		}
		if(idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria é adulto. ");
		}
	entrada.close();
	}	

}
