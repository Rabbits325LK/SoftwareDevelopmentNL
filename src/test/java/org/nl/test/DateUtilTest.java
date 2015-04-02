package org.nl.test;

import java.util.Date;
import java.text.ParseException;

import org.junit.Test;
import org.nl.util.DateChange;

/**
 * DateChange TestModel 
 * @author Rabbits
 * @version 1.0  2015.04.01  11:00 test(testDate())
 */
public class DateUtilTest {
	
	//@Test
	public void testDate(){
		DateChange dc = new DateChange();
		String str = "1990-03-25";
		try {
			Date date = dc.StrToDate(str);
			System.out.println(date);
			String str2 = dc.DateToStr(date);
			System.out.println(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
