package sistem;

import java.util.Scanner;

public class Professor extends Pessoa {

	private String titulo;
	private Forma formacao;
	private float salario;
	Scanner leitura = new Scanner(System.in);

	public Professor() {
		super ();
		this.formacao = new Forma ();
	}

	public Professor(String nome, String cpf, String sexo,Endereco endereco, String titulo, String formacao, float salario) {
		super();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		System.out.print("Digite o seu t�tulo: ");
		titulo = leitura.nextLine();
		this.titulo = titulo;
	}

	public Forma getFormacao() {
		return formacao;
	}

	public void setFormacao(Forma formacao) {
		this.formacao = formacao;
	}
	
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		System.out.print("Digite o seu sal�rio: ");
		salario = leitura.nextFloat();
		this.salario = salario;
	}

	public void cadastrarProfessor() {

		System.out.println("\n-- Cadastramento de professor --");
		
		setCpf(getCpf());
		setNome(getNome());
		setSexo(getSexo());
		setTitulo(titulo);
		formacao.cadastrarForma();
		setSalario(salario);
		endereco.cadastrarEndereco();
		
	}

	public void dadosProfessor() {
		System.out.println("\n Pessoa F�sica\n" + "-----------------" + "\n   CPF: " + getCpf() + "\n   Nome: "
				+ getNome() + "\n   Sexo: " + getSexo() + "\n   T�tulo: " + getTitulo() + "\n   Sal�rio: " + getSalario()); formacao.dadosForma(); endereco.dadosEndereco();
	}
}
