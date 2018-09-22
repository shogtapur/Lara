class H
{
	public static void main(String[] args) 
	{
		if(true); //blank if block ... does have body
			System.out.println("if");
		else
			System.out.println("else stmt 1");
		
	}


}
/*
CTE:
H.java:7: 'else' without 'if'
                else
                ^
1 error

*/


