package ex13_Calendar;

import java.util.Calendar;

public class DatePrintExample2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		//연도
		int year = now.get(Calendar.YEAR);
		System.out.print(year + "년 ");
		
		//월
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month<10)? ("0"+month) : (""+month);
		System.out.print(strMonth + "월 ");
		
		//일
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+ dayOfMonth):(""+dayOfMonth);
		System.out.print(strDayOfMonth + "일 ");
		
		//요일
		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek - 1] + "요일";
		System.out.print(strDayOfWeek + "");
		
		//시간
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour<10)?("0"+hour):(" "+hour);
		System.out.print(strHour + "시 ");
		
		//분
		int second = now.get(Calendar.SECOND);
		String strSecond = (second<10)?("0"+second):(""+second);
		System.out.print(strSecond + "분");
	}

}
