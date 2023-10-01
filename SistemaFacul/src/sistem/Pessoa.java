package sistem;

import java.util.Scanner;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String sexo;
	protected Endereco endereco;
	Scanner leitura = new Scanner(System.in);

	public Pessoa() {
		this.endereco = new Endereco();
	}

	public Pessoa(String nome, String cpf, String sexo, Endereco endereco, String tipoEndereco, String logradouro, String numero, String complemento, String cidade, String uf) {

		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {		
		System.out.println("Digite seu nome: ");
		nome = leitura.nextLine().toUpperCase();
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		System.out.println("Digite seu CPF: ");
		cpf = leitura.nextLine();

		while (cpf.length() != 11) {
			System.out.println("\nCPF inv�lido!");
			System.out.println("Informe o CPF: ");
			cpf = (leitura.nextLine());
		}
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		System.out.println("Digite seu sexo: ");
		sexo = leitura.nextLine();
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
