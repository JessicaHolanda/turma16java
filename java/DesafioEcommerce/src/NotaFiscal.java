import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NotaFiscal {

	private Cliente cliente;
	private Pagamento pagamento;
	private String data;
	
	public NotaFiscal(Cliente cliente, Pagamento pagamento) {
		this.cliente = cliente;
		this.pagamento = pagamento;
		
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		
		this.data = strDate;
	}
	
	public NotaFiscal(Pagamento pagamento) {
		this.pagamento = pagamento;
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		
		this.data = strDate;
	}

	public NotaFiscal() {
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		
		this.data = strDate;
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	public void verNota() {
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\t\t\tNota fiscal\n");
			System.out.printf("Data: %s \n\nCliente: %s \nTotal sem o imposto: R$ %.2f \nImposto de 9%% sobre produto: R$ %.2f \nTotal a pagar com imposto: R$ %.2f \nForma de pagamento: %s", 
					this.getData(), this.getCliente().getNomeCliente(), this.pagamento.getTotalGeral(), this.pagamento.getImposto(), this.pagamento.getTotalComImposto(), this.pagamento.getOpcPagamento() );
		System.out.println("\n------------------------------------------------------------------------");
	}


	
	

	
	
}
