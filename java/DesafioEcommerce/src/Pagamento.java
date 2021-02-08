
public class Pagamento {
	
	private double totalGeral;
	private double imposto;
	private Carrinho carrinho;
	
	public Pagamento(double totalGeral, double imposto, Carrinho carrinho) {
		this.totalGeral = totalGeral;
		this.imposto = imposto;
		this.carrinho = carrinho;
	}

	public Pagamento() {
	}

	// --------------------------------------------------------------------------------
	
	public double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(double totalGeral) {
		this.totalGeral = totalGeral;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	// --------------------------------------------------------------------------------
	
	public double pagarAVista() {
		this.totalGeral = this.carrinho.getSubTotal() - (0.1*this.carrinho.getSubTotal());
		System.out.println(this.carrinho.getSubTotal());
		return this.totalGeral;
	}
	
	// --------------------------------------------------------------------------------
	
	public double pagarCartao(int parcelas) {
		
			if(parcelas == 1) {
				this.totalGeral = this.carrinho.getSubTotal();
				return this.totalGeral;
			}
			else if(parcelas == 2) {
				this.totalGeral = this.carrinho.getSubTotal() +  (0.1*this.carrinho.getSubTotal());
				return this.totalGeral;
			} 
			else {
				this.totalGeral = this.carrinho.getSubTotal() +  (0.15*this.carrinho.getSubTotal());
				return this.totalGeral;
			}
	}
	
	// --------------------------------------------------------------------------------
	
	public double calcularImposto() {
		this.imposto = (0.09 * this.totalGeral);
		return this.imposto;
	}
	
}
