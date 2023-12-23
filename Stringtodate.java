package string;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;


public class Stringtodate {
	public static void main(String[] args)
	{
		String string_date = "May 1, 2012";
		DateTimeFormatter format = DateTimeFormatter.ofPattern
				("MMMM d, yyyy",Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string_date,format);
		System.out.println(date);
	}

}
