package br.com.exdev2me;

import javax.swing.JOptionPane;

public class UrnaEletronica {

	public static void main(String[] args) {
		int operacaoMesario = 0;
		int operacaoVoto = 0;
		int totalVotoAngela = 0;
		int totalVotoGean = 0;
		int totalVotoCesar = 0;
		int totalVotoNulo = 0;
		int totalVotoBranco = 0;
				
		do {
			operacaoMesario = Integer.valueOf(JOptionPane.showInputDialog("Digite a opção: \n [1] Para iniciar a eleição \n [2] Para finalizar a eleição "));
			
			if (operacaoMesario == 1) {
				operacaoVoto = Integer.valueOf(JOptionPane.showInputDialog("------Candidatos----- \n"
						+ "[1] ANGELA PEPINO - PMDB \n"
						+ "[2] GEAN DA SILVA - PT \n"
						+ "[3] CESAR SOUZA NETO - DEM \n"
						+ "[4] VOTO NULO \n"
						+ "[5] VOTO BRANCO \n"));
				if (operacaoVoto == 1) {
					totalVotoAngela++;
				} else if (operacaoVoto == 2) {
					totalVotoGean++;
				} else if (operacaoVoto == 3) {
					totalVotoCesar++;
				} else if (operacaoVoto == 4) {
					totalVotoNulo++;
				} else if (operacaoVoto == 5) {
					totalVotoBranco++;
				} else {
					System.out.println("VOTO INVALIDO");
				}
				
					}
			else if (operacaoMesario == 2) {
				System.out.println("VOTAÇÃO ENCERRADA");
			}
			else {
				System.out.println("OPÇÃO INVALIDA");
			}
			
			
		} while (operacaoMesario != 2);
		
		// Contagem dos votos.

		System.out.println("TOTAL DE VOTOS: " + (totalVotoAngela+totalVotoGean+totalVotoCesar+totalVotoNulo+totalVotoBranco));
		
		System.out.println("Total de votos para ANGELA : " + totalVotoAngela);
		System.out.println("Total de votos para GEAN : " + totalVotoGean);
		System.out.println("Total de votos para CESAR : " + totalVotoCesar);
		System.out.println("Total de votos para NULO : " + totalVotoNulo);
		System.out.println("Total de votos para BRANCO : " + totalVotoBranco);
		
	}

}
