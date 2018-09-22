class I
{
	public static void main(String[] args) 
	{
		if(true)
			System.out.println("if");
		else
		{
			int i =10;
			System.out.println("else stmt 1");
		}
	
	System.out.println("end : "+i);
	}
}

/*
I.java:13: cannot find symbol
symbol  : variable i
location: class I
        System.out.println("end : "+i);
                                    ^
1 error

*/

