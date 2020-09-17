package lp1;

import java.util.Set;

public class Calcado {

	private String tipoDeCalcado;
	private Set<String> estilo;
	private Set<String> cor;
	private Set<Integer> tamanho;
	
	public Calcado(String tipoDeCalcado, Set<String> estilo, Set<String> cor, Set<Integer> tamanho) {
		super();
		this.tipoDeCalcado = tipoDeCalcado;
		this.estilo = estilo;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public boolean escolherCalcado(Integer tamanho, String estilo, String cor) {
		if (verificarTamanho(tamanho) && verificarEstilo(estilo) && verificarCor(cor)) {
			System.out.println("Você está com sorte! Temos o calçado com o tamanho, estilo e cor que você escolheu!");
			return true;
		}
		System.out.println("Infelizmente não encontramos o calçado com essas especificações");
		return false;
	}

	private boolean verificarTamanho(Integer tamanho) {
		for (Integer t : getTamanho()) {
			if (t == tamanho) {
				return true;
			}
		}
		System.out.println("Não possui o calçado " + getTipoDeCalcado() + " com o tamanho " + tamanho);
		return false;
	}

	private boolean verificarEstilo(String estilo) {
		for (String e : getEstilo()) {
			if (e == estilo) {
				return true;
			}
		}
		System.out.println("Não possui o calçado " + getTipoDeCalcado() + " com esse estilo");
		return false;
	}

	private boolean verificarCor(String cor) {
		for (String c : getCor()) {
			if (c == cor) {
				return true;
			}
		}
		System.out.println("Não possui o calçado " + getTipoDeCalcado() + " com a cor " + cor);
		return false;
	}
	
	public boolean adicionarTamanho(Integer tamanho) {
		if(tamanho > 0) {
			getTamanho().add(tamanho);
			System.out.println("Tamanho adicionado com sucesso");
			return true;
		}
		return false;
	}
	
	public boolean adicionarCor(String cor) {
		if(!cor.isBlank()) {
			getCor().add(cor);
			System.out.println("Cor adicionada com sucesso");
			return true;
		}
		return false;
	}
	
	public boolean adicionarEstilo(String estilo) {
		if(!estilo.isBlank()) {
			getEstilo().add(estilo);
			System.out.println("Estilo adicionado com sucesso");
			return true;
		}
		return false;
	}
	
	
	
	

	public String getTipoDeCalcado() {
		return tipoDeCalcado;
	}

	public void setTipoDeCalcado(String tipoDeCalcado) {
		this.tipoDeCalcado = tipoDeCalcado;
	}

	public Set<String> getEstilo() {
		return estilo;
	}

	public void setEstilo(Set<String> estilo) {
		this.estilo = estilo;
	}

	public Set<String> getCor() {
		return cor;
	}

	public void setCor(Set<String> cor) {
		this.cor = cor;
	}

	public Set<Integer> getTamanho() {
		return tamanho;
	}

	public void setTamanho(Set<Integer> tamanho) {
		this.tamanho = tamanho;
	}

}
