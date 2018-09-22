class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			int i = 10;
			System.out.println("if-block-stmt1" + i); 
			System.out.println("if-block-stmt2" + i++);
			i++;
			System.out.println("if-block-stmt3" + ++i);
		}
		System.out.println("main end:" + i); 
	}
}
