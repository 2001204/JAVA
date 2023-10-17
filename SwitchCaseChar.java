class SwitchcaseDigit
{
	public static void main(String args[])
	{

		char choice = 'A';

		switch(choice)
		{
				
			case 'A':
			case 'a':
				System.out.println("case A");
				break;
			
			case 'B':
			case 'b':
				System.out.println("case B");
				break;

			default:
				System.out.println("default case");
		}

		System.out.println("Out of switch case");
	}
}
