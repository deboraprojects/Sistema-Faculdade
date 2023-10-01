package sistem;

import java.util.Scanner;

public class Curso {

	private String nome;
	private String tipo;
	private int ch;
	private float duracao;
	private float mensalidade;
	Scanner leitura = new Scanner(System.in);
	
	public Curso () {
	}

	public Curso(String nome, String tipo, int ch, float duracao, float mensalidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.print("Digite o nome do curso: ");
		nome = leitura.nextLine();
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		System.out.print("Digite o tipo do curso: ");
		tipo = leitura.nextLine();
		this.tipo = tipo;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		System.out.print("Digite a carga hor�ria: ");
		ch = leitura.nextInt();
		this.ch = ch;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		System.out.print("Digite a dura��o do curso: ");
		duracao = leitura.nextFloat();
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		System.out.print("Digite o valor da mensalidade do curso: ");
		mensalidade = leitura.nextFloat();
		this.mensalidade = mensalidade;
	}
	
	public void cadastrarCurso() {
		setNome(nome);
		setTipo(tipo);
		setCh(ch);	
		setDuracao(duracao);
		setMensalidade(mensalidade);
	}
	
	public void dadosCurso() {
		System.out.println( "\n   Nome: " +getNome()
				+ "\n   Tipo do curso: " + getTipo() + "\n   Carga hor�ria: " + getCh() + "\n   Dura��o: " + getDuracao() + 
				"\n   Mensalidade: " + getMensalidade ());
	}
}
