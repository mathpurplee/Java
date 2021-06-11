package ex13_Calendar;

import java.util.Calendar;

public class DatePrintExample2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		//����
		int year = now.get(Calendar.YEAR);
		System.out.print(year + "�� ");
		
		//��
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month<10)? ("0"+month) : (""+month);
		System.out.print(strMonth + "�� ");
		
		//��
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+ dayOfMonth):(""+dayOfMonth);
		System.out.print(strDayOfMonth + "�� ");
		
		//����
		String[] dayArray = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek - 1] + "����";
		System.out.print(strDayOfWeek + "");
		
		//�ð�
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour<10)?("0"+hour):(" "+hour);
		System.out.print(strHour + "�� ");
		
		//��
		int second = now.get(Calendar.SECOND);
		String strSecond = (second<10)?("0"+second):(""+second);
		System.out.print(strSecond + "��");
	}

}
