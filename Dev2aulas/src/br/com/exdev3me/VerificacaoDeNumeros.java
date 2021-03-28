package br.com.exdev3me;

import javax.swing.JOptionPane;

public class VerificacaoDeNumeros {

	public static void main(String[] args) {
		
		Double valor1 = Double.valueOf(JOptionPane.showInputDialog("Qual o primeiro Valor? "));
	
		
		if (valor1 < 0) {
			System.out.println("Número Negativo");
			
		} else {
			System.err.println("Número Positivo");
		}
		
		

	}

}
