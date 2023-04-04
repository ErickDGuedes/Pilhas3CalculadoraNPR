package controller;
import br.edu.fateczl.pilhaint.Pilha;

public class NPRcontroller {
	
	public NPRcontroller() {
		super();
	}
	//Insere os Números na Pilha
	public void InsereValor(Pilha p, int valor) throws Exception {
		if(p.isEmpty()) {
			p.push(valor);
			System.out.println(p.top());
		}else {
			p.push(valor);
			System.out.println(p.top());
		}
	}
	
	//Operações
	public String npr(Pilha p, int operacao) throws Exception {
		switch(operacao) {
		//Soma
		case 1: 
			if(p.size() ==  1) {
				System.out.println("ERRO, Adicione mais números para fazer operações");
				return null;
			}
			if(p.size() > 1) {
				int valor1 = p.pop();
				int valor2 = p.pop();
				int soma = valor1 + valor2;
				p.push(soma);
				System.out.println(p.top());
				return null;
			}
			break;
	    //Subtração
		case 2:
			if(p.size() ==  1) {
				System.out.println("ERRO, Adicione mais números para fazer operações");
				return null;
			}
			while(p.size() > 1) {
				int valor1 = p.pop();
				int valor2 = p.pop();
				if(valor1 > valor2) {
					int subtracao = valor1 - valor2;
					p.push(subtracao);
					System.out.println(p.top());
					return null;
				}else {
					int subtracao = valor2 - valor1;
					p.push(subtracao);
					System.out.println(p.top());
					return null;
				}
			}
			break;
	    //Multiplicação	
		case 3:
			if(p.size() ==  1) {
				System.out.println("ERRO, Adicione mais números para fazer operações");
				return null;
			}
			while(p.size() > 1) {
				int valor1 = p.pop();
				int valor2 = p.pop();
				int multiplicacao = valor1 * valor2;
				p.push(multiplicacao);
				System.out.println(p.top());
				return null;
			}
			break;
		//Divisão
		case 4:
			if(p.size() ==  1) {
				System.out.println("ERRO, Adicione mais números para fazer operações");
				return null;
			}
			while(p.size() > 1) {
				int valor1 = p.pop();
				int valor2 = p.pop();
				if(valor1 > valor2) {
					int divisao = valor1 / valor2;
					p.push(divisao);
					System.out.println(p.top());
					return null;
				}else {
					int divisao = valor2 / valor1;
					p.push(divisao);
					System.out.println(p.top());
					return null;
				}
			}
			break;
		}
		return null;
	}
}
