package modelo;

public class Pessoa {
	//ATRIBUTOS
	private String nome;
	private int telefone;
	//METODOS ACESSORES
	public String getNome()
	{
		return nome;
	}
	public void setNome (String nome) {
		if(!nome.equals("")) {
		this.nome = nome;
	} else {
		throw new IllegalArgumentException("O nome não pode ser vazio");
	}
 }
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		if(telefone >= 100000) {
			this.telefone = telefone;
		}else {
			throw new IllegalArgumentException("O telefone deve ter ao menos sete dígitos");
		}
	}
	//construtor
	public Pessoa(String nome, int telefone) {
		setNome(nome);
		setTelefone(telefone);
	}
}