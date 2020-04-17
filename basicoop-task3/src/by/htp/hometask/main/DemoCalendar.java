package by.htp.hometask.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import by.htp.hometask.bean.Calendar;
import by.htp.hometask.logic.CalendarLogic;
import by.htp.hometask.view.PrintHoliday;

public class DemoCalendar {

	public static void main(String[] args) {
		CalendarLogic logic = new CalendarLogic();
		PrintHoliday print = new PrintHoliday();

		int year = 2020;
		Calendar calendar = new Calendar(year);
		logic.addWeekend(calendar, year);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		logic.addHoliday(calendar, LocalDate.parse("01.01." + year, dtf), "New Year");
		logic.addHoliday(calendar, LocalDate.parse("07.01." + year, dtf), "Orthodox Christmas");
		logic.addHoliday(calendar, LocalDate.parse("08.03." + year, dtf), "Women’s Day");
		logic.addHoliday(calendar, LocalDate.parse("01.05." + year, dtf), "Labour Day");
		logic.addHoliday(calendar, LocalDate.parse("09.05." + year, dtf), "Victory Day");
		logic.addHoliday(calendar, LocalDate.parse("03.07." + year, dtf), "Independence Day");
		logic.addHoliday(calendar, LocalDate.parse("07.11." + year, dtf), "October Revolution Day");
		logic.addHoliday(calendar, LocalDate.parse("25.12." + year, dtf), "Catholic Christmas");

		print.printHolidays(calendar);

		Calendar.Holiday holiday = logic.removeHoliday(calendar, "October Revolution Day");
		System.out.println("\nremoved holiday " + holiday);
	}

}
