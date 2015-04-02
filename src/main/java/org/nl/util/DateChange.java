package org.nl.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import sun.org.mozilla.javascript.internal.json.JsonParser.ParseException;

public class DateChange {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * 日期转换成字符串
	 * @param date
	 * @return
	 */
	public String DateToStr(Date date) {
		
		String str = sdf.format(date);
		return str;
	}
	
	/**
	 * 将字符串转换成日期
	 * @param str
	 * @return
	 * @throws java.text.ParseException
	 */
	public Date StrToDate(String str) throws java.text.ParseException {
		Date date = null;
		date = (Date) sdf.parse(str);
		return date;
	}
}
