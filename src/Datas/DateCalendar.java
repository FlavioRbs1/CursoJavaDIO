package Datas;

import java.util.Calendar;

public class DateCalendar {

	public static void main(String[] args) {

		Calendar agora = Calendar.getInstance();
		System.out.println(agora.getTime());
	
		int amount = 0;
		agora.add(Calendar.DATE, amount -365);
		System.out.println(agora.getTime());
		
		agora.add(Calendar.MONTH, amount - 5);
		System.out.println(agora.getTime());
		
		agora.add(Calendar.YEAR, amount - 5);
		System.out.println(agora.getTime());
		
//		IMPRIMINDO DATAS E HORAS
		
		System.out.printf("%tc\n", agora);
		System.out.printf("%tF\n", agora);
		System.out.printf("%tD\n", agora);
		System.out.printf("%tr\n", agora);
		System.out.printf("%tT\n", agora);
		
	}

}
