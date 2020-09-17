package lp1;

public class InstrumentoMusical {

	private String instrumento;
	private String marca;
	private Integer quantidade;
	private Double preco;
	private Double saldo = 0.0;

	public InstrumentoMusical(String instrumento, String marca, Integer quantidade, Double preco) {
		this.instrumento = instrumento;
		this.marca = marca;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public boolean venderInstrumento(Integer quantidade) {
		if(verificarEstoque(quantidade)){
			Double saldo = getSaldo() + (getPreco() * quantidade);
			setSaldo(saldo);
			saldoTotal();
			return true;
		}
		return false;
	}

	private boolean verificarEstoque(Integer quantidade) {
		if (getQuantidade() >= quantidade) {
			setQuantidade(getQuantidade()-quantidade);
			return true;
		} else if (getQuantidade() > 0) {
			System.out.println("Possuímos apenas " + getQuantidade() + " em estoque");
			return false;
		}
		System.out.println("Acabou o estoque de " + getInstrumento());
		return false;
	}

	private void saldoTotal() {
		System.out.println("Seu total com vendas em " + getInstrumento() + " é de R$" + getSaldo());
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
