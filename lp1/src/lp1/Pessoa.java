package lp1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String rg;
	private String sexo;
	private Double altura;

	private Pessoa(String nome, String dataNascimento, String rg, String sexo, Double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.sexo = sexo;
		this.altura = altura;
	}

	public static Pessoa of(String nome, String dataNascimento, String rg, String sexo, Double altura) {
		return new Pessoa(nome, dataNascimento, rg, sexo, altura);
	}

	public String alterarNome(String nome) {
		setNome(nome);
		return toString();
	}

	public String alterarDataNascimento(String dataNascimento) {
		setDataNascimento(dataNascimento);
		return toString();
	}

	public String alterarRg(String rg) {
		setRg(rg);
		return toString();
	}

	public String alterarSexo(String sexo) {
		setSexo(sexo);
		return getSexo();
	}

	public String alterarAltura(Double altura) {
		setAltura(altura);
		return toString();
	}

	private Integer getIdade() {
		LocalDate dataNascimento = LocalDate.parse(getDataNascimento());
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getDataNascimento() {
		return dataNascimento;
	}

	private void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private String getRg() {
		return rg;
	}

	private void setRg(String rg) {
		this.rg = rg;
	}

	private String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	private Double getAltura() {
		return altura;
	}

	private void setAltura(Double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nRG: " + getRg() + "\nSexo: " + getSexo()
				+ "\nAltura: " + getAltura();
	}

}
