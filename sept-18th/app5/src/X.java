class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if((i++ == 10) && (i++ == 12))
		{
			System.out.println("if-block-stmt1" + i); 
			System.out.println("if-block-stmt2" + i++);
			i++;
			System.out.println("if-block-stmt3" + ++i);
		}
		System.out.println("main end:" + i); // 12
	}
}
