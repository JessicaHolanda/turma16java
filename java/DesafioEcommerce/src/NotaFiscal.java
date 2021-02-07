
public class NotaFiscal {

	private Cliente cliente;
	private Pagamento pagamento;
	
	public NotaFiscal(Cliente cliente, Pagamento pagamento) {
		this.cliente = cliente;
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
	
}
