package br.com.exdev3me;

import javax.swing.JOptionPane;

public class MaiorValor {

	public static void main(String[] args) {
		int valor1 = Integer.valueOf(JOptionPane.showInputDialog("Primeiro Valor: "));;
		int valor2 = Integer.valueOf(JOptionPane.showInputDialog("Segundo Valor: "));;
		int valor3 = Integer.valueOf(JOptionPane.showInputDialog("Terceiro Valor: "));;
		int maiorValor = 0;

		
		System.out.println("Maior valor: " + procurarOMaiorValor(valor1, valor2, valor3, maiorValor));

	}
	
	public static int procurarOMaiorValor(int valor1, int valor2, int valor3, int maiorValor) {
		if(valor1>valor2 && valor1>valor3) {
			maiorValor = valor1;
		} else if (valor2>valor3 && valor2>valor1) {
			maiorValor = valor2;
		} else {
			maiorValor = valor3;
		}
		return maiorValor;
	}
	

}
