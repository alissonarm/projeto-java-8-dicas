package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class TestaData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasData = LocalDate.of(2022, Month.JULY, 1);
		System.out.println(olimpiadasData);
		
		int anos = olimpiadasData.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasData);
		System.out.println(periodo.getMonths());

		System.out.println(olimpiadasData.plusYears(4));
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data formatada: " + olimpiadasData.plusYears(4).format(formatador));

		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth mes = YearMonth.now();
		System.out.println(mes);
		
		LocalTime intervalo = LocalTime.of(14, 20);
		System.out.println(intervalo);
		
		LocalDate data = LocalDate.of(2099, 1, 25);
		System.out.println(data);
		
		LocalDate data2 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data2);
		
		LocalDate agora2 = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo2 = Period.between(agora2, dataFutura);
		System.out.println(periodo2.getDays());
		
		
	}

}
