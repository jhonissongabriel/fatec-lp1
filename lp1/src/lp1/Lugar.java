package lp1;

public class Lugar {

	protected String rua;
	private Integer numero;
	protected String cep;
	public String cidade;
	public String uf;
	
	protected Lugar(String rua, Integer numero, String cep, String cidade, String uf) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String alterarNumero(Integer numero) {
		if (numero.intValue() >= 0) {
			setNumero(numero);
			return "Número alterado com sucesso";
		}
		return "Não foi possível alterar o número. Utilize números inteiros maior ou igal a 0.";
	}

	public String alterarRua(String rua) {
		if (!rua.isBlank() && rua.length() >= 3) {
			setRua(rua);
			return "Rua alterada com sucesso";
		}
		return "Não foi possível alterar a rua. O nome da rua deve conter pelo menos 3 caracteres";
	}

	public String alterarCep(Integer c) {
		String cep = c.toString();
		if (!cep.isBlank() && cep.length() == 8) {
			setCep(cep);
			return "CEP alterado com sucesso";
		}
		return "Não foi possível alterar o CEP. Insira apenas números";
	}
	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
