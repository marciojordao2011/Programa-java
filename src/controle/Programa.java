package controle;

import javax.swing.JOptionPane;

import modelo.Pessoa;
import visao.TelaCadastroPessoa;


public class Programa implements IOuvinteBotao {

	public static void main(String[] args) {
		
		TelaCadastroPessoa tela = new TelaCadastroPessoa(new Programa());
		tela.setVisible(true);

	}
	
	public void gravaPessoa (Pessoa p) {
		JOptionPane.showMessageDialog(null, "A pessoa" + p.getNome() + "de telefone"+ p.getTelefone()+ "foi cadastrado.");
	}

}
