class S
{
	public static void main(String[] args) 
	{
		int i =0;
		boolean b1=( i ++ ==1)  || (i++ == 1) ;
		System.out.println(i); // 2
		System.out.println(b1); // true
	}
	}
