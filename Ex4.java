package br.com.lacosdecisao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double numero = 0.0;
	
	System.out.println("Escreva um n�mero: ");
	numero = entrada.nextDouble();
	
	if(numero % 2 == 0) {
		System.out.println(numero + " � um n�mero par. ");
	}
	else {
		System.out.println(numero + " � um n�mero impar");
	}
    if(numero % 2 == 0) {
    	numero = Math.sqrt(numero);
    	System.out.println("A raiz quadrado do n�mero �: " + numero);
    }
    else {
    	numero = Math.pow(numero, 2.0);
    	System.out.println("O n�mero elevado ao quadrada �: " + numero);
    }
    entrada.close();
	}
	}


