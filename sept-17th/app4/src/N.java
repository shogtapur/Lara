class N
{
	public static void main(String[] args) 
	{
		int i =0;
		System.out.println(true || (i++ ==0));//true
		// if first operation is true then, wont execute next operation
		System.out.println(i); //0

	}
}
