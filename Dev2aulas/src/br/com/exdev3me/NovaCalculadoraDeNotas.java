package br.com.exdev3me;

import javax.swing.JOptionPane;

public class NovaCalculadoraDeNotas {

	public static void main(String[] args) {

		int n1 ;
		int n2 ;
		int n3 ;
		String nomeAluno;
		int quantidadeDeAlunos = Integer.valueOf(JOptionPane.showInputDialog("Quantos alunos vocês deseja cadastrar?"));
							
			for (int i = 0; i < quantidadeDeAlunos; i++) {
					nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
					n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da primeira nota: "));
					n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da segunda nota: "));
					n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da terceira nota: "));	
					System.out.println("Aluno: " + nomeAluno + " Tem a média de: " + calcularMedia(n1, n2, n3));
			}
			
	}

	public static int calcularMedia(int n1, int n2, int n3) {
		int media = (n1 + n2 + n3) / 3;
		
		return media;
	}
	
	
	}

