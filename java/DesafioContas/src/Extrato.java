import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Extrato {
	
	//atributos
	private String data; 
	private String descricao;
	private String transacao;
	private double valor;
	
	// Função contrutor
	public Extrato() {
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		
		this.data = strDate;
	}
	
	// Getters and setters
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTransacao() {
		return this.transacao;
	}
	
	public void setTransacao(String transacao) {
		this.transacao = transacao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
