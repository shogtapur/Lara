class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begine");
		if(true)
		{
			System.out.println("if1 - begine");
			if(true)
			{
				System.out.println("if2- begine");
					if(true)
						System.out.println("if3 - body");
					else
						System.out.println("else3");
				System.out.println("if2- end");
			}
			else
			{
				System.out.println("else2");
			}
			System.out.println("if1- end");
		}
		else
		{
				System.out.println("else1" );
		}

		System.out.println("main end");
	}
}
