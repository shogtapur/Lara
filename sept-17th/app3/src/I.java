class I
{
	public static void main(String[] args) 
	{
		int x=0;
		int y = x++ + x + ++x + x;
		//		0   + 1 +   2 + 2
		System.out.println(x); //2
		System.out.println(y); //5

	}
}
