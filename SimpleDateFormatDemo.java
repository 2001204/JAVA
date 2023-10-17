import java.util.*;
import java.text.*;
class SimpleDateFormatDemo
{
	public static void main(String args[]) throws ParseException
	{
		Date d = new Date();
		System.out.println(d);

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
		String s = df.format(d);
		System.out.println("Formatted Date (Locale.UK): "+s);
		
		//Date object => formatted String 
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		//sdf.applyPattern("dd/MM/yyyy HH:mm");
		sdf.applyPattern("dd/MMM/yyyy HH:mm");
		s = sdf.format(d);
		System.out.println("SimpleDateFormat date: "+s);
		
		//String to Date conversion
		String strDate="24/Nov/2020";  
    		Date date1=new SimpleDateFormat("dd/MMM/yyyy").parse(strDate);  
    		System.out.println(strDate+"\t"+date1);
    		
	}
}

