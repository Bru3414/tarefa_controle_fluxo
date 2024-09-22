package br.com.bdam;

public class TarefaControleFluxo {

	public static void main(String[] args) {
		double n1 = 7;
		double n2 = 9;
		double n3 = 4;
		double n4 = 6;
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 7) {
			System.out.print("Você foi aprovado");
		} else if (media >= 5) {
			System.out.print("Você esta de recuperação");
		} else { 
			System.out.print("Você foi reprovado");
		}
	}

}
