package Datas;

import java.util.Calendar;

public class exercicioData {

	public static void main(String[] args) {

		Calendar vencimento = Calendar.getInstance();
		Calendar dtPagto = Calendar.getInstance();
		
		vencimento.add(Calendar.DATE, -3);
		System.out.println(vencimento.getTime());
		
		if(vencimento.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY) {
			dtPagto = vencimento;
			int amount = 0;
			dtPagto.add(Calendar.DATE, amount +1);
			System.out.println("O dia do pagamento é: "+dtPagto.getTime());
		}else if(vencimento.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY) {
			dtPagto = vencimento;
			int amount = 0;
			dtPagto.add(Calendar.DATE, amount +2);
			System.out.println("O dia do pagamento é: "+dtPagto.getTime());
		}else {
			System.out.println("O dia do pagamento é: "+vencimento.getTime());	
		}
		
	}

}
