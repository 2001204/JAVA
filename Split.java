public class Split
{  
    public static void main(String args[])
{  
        String s1= "12/348/389695/6895/455645/654/114515/4587/852251";
        
	String[] s2=s1.split("/", 6); 
       
 	for(String s3:s2){  
        
    	System.out.println(s3);  
        }  
    }
}