package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localDate {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje �:"+hoje);

		LocalDate ontem = hoje.minusDays(1);
		System.out.println("Ontem foi:"+ontem);
		
		LocalDate amanha = hoje.plusDays(1);
		System.out.println("Amanh� � :"+amanha);
		
		LocalTime agora = LocalTime.now();
		System.out.println("A hora agora �: "+agora);
		
		LocalTime daquiaPouco = agora.plusHours(5);
		System.out.println("Hora daqui a 5 horas: "+daquiaPouco);
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println("Data e Hora agora � : "+dataHora);
		
		LocalDateTime exercicios = dataHora.plusYears(4).plusMonths(6).plusHours(13);
		System.out.println("Data e Hora do exerc�cio solicitado: "+exercicios);
	}

}
