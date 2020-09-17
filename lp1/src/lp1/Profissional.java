package lp1;

import java.math.BigDecimal;

public class Profissional {
	
	public String profissao;
	protected String empresa;
	private BigDecimal salario;
	
	public Profissional(String profissao, String empresa, BigDecimal salario) {
		this.profissao = profissao;
		this.empresa = empresa;
		this.salario = salario;
	}
	
	public BigDecimal getComissao(BigDecimal comissao) {
		return getSalario().add(comissao);
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	

	
	
}
