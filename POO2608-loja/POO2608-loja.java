import javax.swing.JOptionPane;

public class Loja {
/*-----------------------------------------------*
 *SENAC - TADS - Programação Orientada a Objetos *
 *      Autor: 1142369108 - Caroline Stelitano   *
 *-----------------------------------------------*
 *Objetivo: Busca e Produto						 *
 *                                               *
 *Descrição: Fazer busca do melhor preço e       *
 * 				retornar o produto    			 *
 *-----------------------------------------------*       
  
 * ----------------------------------------------*/
	public static void main(String[] args) {
		String[] produto = {"p001", "p002", "p003", "p004", "p005", "p006", "p007", "p008", "p009", "p010"};
		float[] preco = {7.60f, 2.56f, 12.95f, 8.30f, 7.40f, 10.6f, 3.00f, 35.90f, 9.50f, 5.75f};
		String codigo = JOptionPane.showInputDialog("Digite o código do produto:");
		
		for(int i = 0; i < produto.length; i++)
		{
			if(codigo.equals(produto[i]))
			{
				JOptionPane.showMessageDialog(null, "Preco do produto: " + preco[i]);
				break;
			}
		}
	}
}
