class L
{
	public static void main(String[] args) 
	{
		int i=0;
		int j = i++ + i++ + i++ + i +
				++i + i++ + ++i + i +
				--i + i++ + --i + i +
				i-- + i++ + i-- + i +
				i-- + ++i + i + i++ + i;
				//  0 + 1 + 2 + 3+ 
				//  4 + 4 + 6 + 6+
				//  5 + 5 + 5 + 5+
				//  5 + 4 + 5 + 4+
				//  4 + 4 + 4 + 4+ 5
		System.out.println(i); //5
		System.out.println(j); //85

	}
}