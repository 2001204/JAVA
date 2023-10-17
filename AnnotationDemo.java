import java.io.*;
import java.lang.reflect.*;		//For Method, Field, Constructor class
import java.lang.annotation.*;		//For RetentionPolicy enumeration and @Retention annotation

@Retention (RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}


class AnnotationDemo
{
	@MyAnno(str = "Annotation example", val = 100)
	public void myFun(String str, int num)
	{
		System.out.println(str +" " + num);

	}

	public static void main (String args[]) throws NoSuchMethodException
	{
		
                Class c = AnnotationDemo.class;
                Method m = c.getMethod("myFun",String.class,int.class);
		
		//checking whether MyAnno annotation is present with the specific method refered by m which is myFun();
		if(m.isAnnotationPresent(MyAnno.class))
		{
			System.out.println("MyAnno.class annotation is present with the method myFun.");
			MyAnno anno = m.getAnnotation(MyAnno.class);
                	System.out.println("str = " + anno.str() + ", val =  "  + anno.val());
		}
		
		
	}
}

