package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.IOuvinteBotao;
import modelo.Pessoa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	
	//Atributo que armazena a referencia ao objeto que grava a pessoa ao BD
	private IOuvinteBotao ouvinteBotao;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private TelaCadastroPessoa() {
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 11, 70, 14);
		contentPane.add(lblNome);
		
		JLabel lblTelfone = new JLabel("Telefone:");
		lblTelfone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelfone.setBounds(10, 36, 70, 14);
		contentPane.add(lblTelfone);
		
		txtNome = new JTextField();
		txtNome.setBounds(102, 8, 322, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(102, 33, 322, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastra");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastra();
			}
		});
		btnCadastra.setBounds(335, 64, 89, 23);
		contentPane.add(btnCadastra);
	}
	
	public TelaCadastroPessoa(IOuvinteBotao ouvinteBotao) {
		this();
		this.ouvinteBotao = ouvinteBotao;
	}
	
	private void cadastra() {
		String nome = txtNome.getText();
		int telefone = Integer.parseInt(txtTelefone.getText());
		Pessoa p = new Pessoa (nome, telefone);
		ouvinteBotao.gravaPessoa(p);
	}
}
