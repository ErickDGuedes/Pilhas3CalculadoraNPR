package view;
import javax.swing.JOptionPane;
import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRcontroller;

public class Principal {

	public static void main(String[] args) throws Exception {
		NPRcontroller npr = new NPRcontroller();
		Pilha p = new Pilha();
		
		//Inicia a Pilha com dois Números
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		npr.InsereValor(p, valor1);
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		npr.InsereValor(p, valor2);	
		
		//Operações 
		int operacao = 0;
		while(operacao != 9) {
			operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Operação: \n"
					+ "1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Adicionar novo valor\n9 - FIM\n"));
			npr.npr(p, operacao);
			//Valores Extras
			if(operacao == 5) {
				int valorExtra = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
				npr.InsereValor(p, valorExtra);
			}
			if(p.size() == 9) {
				JOptionPane.showMessageDialog(null, "FIM");
			}
		}
	}
}
