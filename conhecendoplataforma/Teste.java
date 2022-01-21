import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.Period;

public class Teste{
	static LocalDate localDateHoje = LocalDate.now();
	static LocalDate localDateOntem = LocalDate.now().minusDays(1);
	static LocalTime localTime = LocalTime.now();
	static LocalDateTime localDateTime = LocalDateTime.now();
	static MonthDay monthDay = MonthDay.now();
	static YearMonth yearMonth = YearMonth.now();
	static Period period = Period.between(localDateHoje, localDateOntem); 
	static LocalDate localDate = LocalDate.now();

	public static void main (String [] args){
		System.out.println("localDateHoje " + localDateHoje);	
		System.out.println("localDateOntem " + localDateOntem);	
		System.out.println("localTime " + localTime);	
		System.out.println("localDateTime " + localDateTime);	
		System.out.println("monthDay " + monthDay);	
		System.out.println("yearMonth " + yearMonth);	
		System.out.println("period " + period);	

		//manipulando datas
		LocalDate localDateAmanha = localDateOntem.plusDays(2);
		System.out.println("localDateAmanha " + localDateAmanha);
		localDateTime = localDateTime.plusDays(1).plusMonths(1).plusHours(2);
		System.out.println("localDateTime " + localDateTime);	
		localDate = localDate.minusDays(1).plusMonths(5);
		System.out.println("localDate " + localDate);

		//extraindo partes de datas:
		int year = localDate.getYear();
		System.out.println("year " + year);
		String month = localDateTime.getMonth().toString();
		System.out.println("month " + month);
		int hour = localTime.getHour();
		System.out.println("hour " + hour);

		//realizando comparações entre datas: 
		boolean isAfter  = localDateHoje.isAfter(localDateOntem); //true
		System.out.println("isAfter " + isAfter);
		boolean isBefore = localDateHoje.isBefore(localDateOntem); //false
		System.out.println("isBefore " + isBefore);
		boolean isEqual  = localDateHoje.isEqual(localDateOntem); //false
		System.out.println("isEqual " + isEqual);
  
		//convertendo LocalDateTime em LocalDate e em LocalTime
		localDate = localDateTime.toLocalDate();
		System.out.println("localDate " + localDate);
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println("localTime " + localTime);
	}
}