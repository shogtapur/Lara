class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if begin");
			if(false)
			{
				System.out.println("from inner -if");
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

