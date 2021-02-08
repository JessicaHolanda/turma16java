import java.util.ArrayList;
import java.util.List;

public class Pagamento {
	
	private double totalGeral;
	private double imposto;
	private double totalComImposto;
	private Carrinho carrinho;
	private String opcPagamento;
	private List<NotaFiscal> nota = new ArrayList<NotaFiscal>();
	
	public Pagamento(double totalGeral, double imposto, Carrinho carrinho) {
		this.totalGeral = totalGeral;
		this.imposto = imposto;
		this.carrinho = carrinho;
	}

	
	public Pagamento(double totalGeral, double imposto, String opcPagamento) {
		this.totalGeral = totalGeral;
		this.imposto = imposto;
		this.opcPagamento = opcPagamento;
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
	
		
	public String getOpcPagamento() {
		return opcPagamento;
	}

	public void setOpcPagamento(String opcPagamento) {
		this.opcPagamento = opcPagamento;
	}


	public double getTotalComImposto() {
		return totalComImposto;
	}


	public void setTotalComImposto(double totalComImposto) {
		this.totalComImposto = totalComImposto;
	}

	
	
	// --------------------------------------------------------------------------------
	


	public double pagarAVista() {
		this.setOpcPagamento("A vista com 10% de desconto");
		this.totalGeral = this.carrinho.getSubTotal() - (0.1*this.carrinho.getSubTotal());
		System.out.println(this.carrinho.getSubTotal());
		this.calcularImposto();
		this.totalComImposto();
		
		/*NotaFiscal notaFiscal = new NotaFiscal();
		Pagamento pagamento = new Pagamento(this.totalGeral, this.imposto, this.opcPagamento);
		notaFiscal.setPagamento(pagamento);
		this.setNota(notaFiscal);*/
		return this.totalGeral;
	}
	
	// --------------------------------------------------------------------------------
	
	public double pagarCartao(int parcelas) {
		
			if(parcelas == 1) {
				this.setOpcPagamento("1x no cartão, valor total sem desconto!");
				this.totalGeral = this.carrinho.getSubTotal();
				this.calcularImposto();
				this.totalComImposto();
				
				return this.totalGeral;
			}
			else if(parcelas == 2) {
				this.setOpcPagamento("2x no cartão, 10% de juros");
				this.totalGeral = this.carrinho.getSubTotal() +  (0.1*this.carrinho.getSubTotal());
				this.calcularImposto();
				this.totalComImposto();
			
				return this.totalGeral;
			} 
			else {
				this.setOpcPagamento("3x no cartão, 15% de juros");
				this.totalGeral = this.carrinho.getSubTotal() +  (0.15*this.carrinho.getSubTotal());
				this.calcularImposto();
				this.totalComImposto();
					
				return this.totalGeral;
			}
	}
	
	// --------------------------------------------------------------------------------
	
	public double calcularImposto() {
		this.imposto = (0.09 * this.totalGeral);
		return this.imposto;
	}
	
	
	public double totalComImposto() {
		this.totalComImposto = this.imposto + this.totalGeral;
		return this.totalComImposto;
	}
	

	
}
