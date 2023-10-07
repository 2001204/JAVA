class InterfaceDemo	{
	
	public static void main(String args[])
	{
	 	//new DBDriver       //ERROR can't create  object of interface
		//DBDriver driver;
		
		DBDriver driver[] = new DBDriver [ 3] ;
		driver [ 0 ] = new MySqlDriver();  
		driver [ 1 ] = new PostGresDriver();  
		driver [ 2 ] = new OracleDriver();  
		for( int i = 0; i < driver.length; i++)
		{
			driver[ i ].createConnection();
			driver[ i ].getConnection();
			driver[ i ].closeConnection();
System.out.println("-----------------------------------------");
		}
		System.out.println("Min Connection Allowed : " + DBDriver.MIN_CONNECTION_ALLOWED);
	}
}

interface DBDriver
{
	int MIN_CONNECTION_ALLOWED =10;	
	void createConnection();
	void getConnection();
	void closeConnection();
}

class MySqlDriver implements DBDriver         
{

	public void createConnection()
	{
 		 System.out.println("creatConnection of MySql");
	}

	public void getConnection()
	{
		System.out.println("getConnection of MySql");
	}

	public void closeConnection()
	{
  		System.out.println("closeConnection of MySql");	
	}	
}

class PostGresDriver implements DBDriver{
	public void createConnection()
	{
  		System.out.println("creatConnection of PostGres");
	}

	public void getConnection()
	{
  		System.out.println("getConnection of PostGres");
	}

	public void closeConnection()
	{
 		 System.out.println("closeConnection of PostGres");
	}
}

class OracleDriver implements DBDriver{

	public void createConnection()
	{
 		 System.out.println("creatConnection of  Oracle");
	}

	public void getConnection()
	{
 		 System.out.println("getConnection of  Oracle");
	}

	public void closeConnection()
	{
		  System.out.println("closeConnection of  Oracle");
	}

}

/*
D:\JAVA Workspace\Classobject>java InterfaceDemo.java
creatConnection of MySql
getConnection of MySql
closeConnection of MySql
-----------------------------------------
creatConnection of PostGres
getConnection of PostGres
closeConnection of PostGres
-----------------------------------------
creatConnection of  Oracle
getConnection of  Oracle
closeConnection of  Oracle
-----------------------------------------
Min Connection Allowed : 10
*/