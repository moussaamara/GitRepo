package mep.creation.consortnt.fichier.util;

import java.util.Date;

public class DateUtil {

	public static Date dateConvert(String dateString) {

		String[] dateInfo = dateString.split(" ");
		String[] dayMonthYear = dateInfo[0].split("/");
		String[] hoursMinuteSeconds = dateInfo[1].split(":");

		return new Date(Integer.parseInt(dayMonthYear[2]), Integer.parseInt(dayMonthYear[1]),
				Integer.parseInt(dayMonthYear[0]), Integer.parseInt(hoursMinuteSeconds[0]),
				Integer.parseInt(hoursMinuteSeconds[1]), Integer.parseInt(hoursMinuteSeconds[2]));
	}
}
