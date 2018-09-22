class Z17
{
	public static void main(String[] args) 
	{
		System.out.println("main begine");
		if(true)
		{
			System.out.println("if1 -begin");
			if(true)
			{
					System.out.println("if2 -begine");
					if(true)
						System.out.println("if3 -body");
					System.out.println("if2 -end");
			}
			System.out.println("if1 -end");
		}
		System.out.println("main end");
	}
}
