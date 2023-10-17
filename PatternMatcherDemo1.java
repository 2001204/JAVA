import java.util.regex.*;
import java.util.*;

class PatternMatcherDemo1
{
	public static void main(String args[])
	{
String data1 = "Today, java is object oriented language";
       
String regex = "\\bjava\\b";
 
Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(data1);
while (matcher.find())
{
  System.out.print("Start index: " + matcher.start());
  System.out.print(" End index: " + matcher.end() + " ");
  System.out.println(matcher.group());
}
	}
}
