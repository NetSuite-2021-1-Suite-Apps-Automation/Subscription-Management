package com.qa.excelreader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main (String args[]) throws ParseException
	{
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
        //System.out.println(today_date);
        cal.setTime(format1.parse("2/25/2021"));
        cal.add(Calendar.MONTH,Integer.parseInt("2") );
        String next_day=format1.format(cal.getTime());
        System.out.println(next_day);
        
	}
}
