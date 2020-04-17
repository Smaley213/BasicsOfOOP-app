package by.htp.hometask.view;

import by.htp.hometask.bean.Calendar;
import by.htp.hometask.bean.Calendar.Holiday;

public class PrintHoliday {

	public void printHolidays(Calendar calendar) {
		for (Holiday holiday : calendar.getHolidays()) {
			System.out.println(holiday);
		}
	}

}
