package Modificadores_04_09;

import java.util.Scanner;

public class ObjetoAutomovelPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);

		//cria um objeto
		Pessoa pessoa = new Pessoa();

		String cor,nome;
		int velocidade;

		System.out.print("Informe a cor do carro: ");
		cor = ler.next();

		System.out.print("Informe a nome do carro: ");
		nome = ler.next();

		System.out.print("Informe a velocidade do carro: ");
		velocidade = ler.nextInt();

		//utiliza o metodo compracarro

		pessoa.compracarro(cor, nome, velocidade);
		
		//utiliza para mostrar o retorno do carro comprado
		
		Automovel carro = pessoa.getAutomovel();
		
		System.out.print(" O carro comprado foi"+ carro.getNome()+ " Na cor"+carro.getCor()+ "  Que Atinge a velocidade de"+carro.getVelocidade());
		
		ler.close();

		

	}

}
