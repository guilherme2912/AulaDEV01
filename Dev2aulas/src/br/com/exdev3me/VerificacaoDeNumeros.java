package br.com.exdev3me;

import javax.swing.JOptionPane;

public class VerificacaoDeNumeros {

	public static void main(String[] args) {
		
		Double valor1 = Double.valueOf(JOptionPane.showInputDialog("Qual o desejado para consulta? "));
		
		indicarValorNegativoPosito(valor1);
		

	}
	
	public static double indicarValorNegativoPosito (Double valor) {
		if (valor < 0) {
			System.out.println("-1");
			
		} else {
			System.err.println("1");
		}
		
		return valor;
	}
	

}
