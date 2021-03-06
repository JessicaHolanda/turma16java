package ex3;

public class Estoque {

	private String codProduto;
	private String descricaoProduto;
	private int qtdProduto;
	private double valorProduto;
	
	public Estoque(String codProduto, String descricaoProduto, int qtdProduto, double valorProduto) {
		this.codProduto = codProduto;
		this.descricaoProduto = descricaoProduto;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
	}
	
	public Estoque() {
		
	}


	public String getCodProduto() {
		return codProduto;
	}


	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}


	public String getDescricaoProduto() {
		return descricaoProduto;
	}


	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	public int getQtdProduto() {
		return qtdProduto;
	}


	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}


	public double getValorProduto() {
		return valorProduto;
	}


	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
    public String toString(){
        return "C�digo: "+
               this.codProduto +
                ", Descri��o: "+
                this.descricaoProduto +
                ", Quantidade: "+
                this.qtdProduto+
                ", Pre�o unit�rio: R$"+
                String.format("%.2f", this.valorProduto);
    }
	
}
