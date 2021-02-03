package bank16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Poupanca extends Conta {

	private int diaAniversario;

	public Poupanca(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario(){
		int data;
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd");  
		String intDate = dateFormat.format(date);  
		data = (Integer.parseInt (intDate));
		
		if(data == this.diaAniversario) {
			super.saldo += (super.saldo*0.05);
		}
	 }
	
}
