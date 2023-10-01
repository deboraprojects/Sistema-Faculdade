package sistem;

import java.util.Scanner;

public class Endereco {

	private String tipoEndereco, logradouro, numero, complemento, cidade, uf;
	Scanner leitura = new Scanner(System.in);
	
	public Endereco() {
		
	}
	
	public Endereco(String tipoEndereco, String logradouro, String numero, String complemento, String cidade,String uf) {
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		System.out.println("Digite seu tipo de endere�o: ");
		tipoEndereco = leitura.nextLine().toUpperCase();
		this.tipoEndereco = tipoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		System.out.println("Digite seu logradouro: ");
		logradouro = leitura.nextLine().toUpperCase();
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		System.out.println("Digite seu n�mero: ");
		numero = leitura.nextLine().toUpperCase();
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		System.out.println("Digite seu complemento: ");
		complemento = leitura.nextLine().toUpperCase();
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		System.out.println("Digite sua cidade: ");
		cidade = leitura.nextLine().toUpperCase();
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		System.out.println("Digite seu UF: ");
		uf = leitura.nextLine().toUpperCase();
		this.uf = uf;
	}
	
	public void cadastrarEndereco() {
		setTipoEndereco(tipoEndereco);
		setLogradouro(logradouro);
		setNumero(numero);
		setComplemento(complemento);
		setCidade(cidade);
		setUf(uf);		
	}
	
	public void dadosEndereco() {
		System.out.println( "\n   Tipo de Endere�o: " +getTipoEndereco()
				+ "\n   Logradouro: " + getLogradouro() + "\n   N�mero: " + getNumero() + "\n   Complemento: "
				+ getComplemento() + "\n   Cidade: " + getCidade() + "\n   UF: " + getUf());
	}
}
