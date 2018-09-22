class L
{
	public static void main(String[] args) 
	{
			System.out.println("main begin");
		if(false)
		{
			System.out.println("if begin");
			if(false)
			{
				System.out.println("from inner -if");
			}
			else
			{
				System.out.println("inner else");
			}
			System.out.println("if end");
		}
		else
		{
			System.out.println("else");
		}
	
	System.out.println(" main end : ");
	}
}

