class F 
{
	public static void main(String[] args) 
	{
		int i = 10;
		if(i = 10) 
		// checking expression: 
		// i re-initialised with value 10 
		// result: 
		// error: incompatible types: int cannot be converted to boolean
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
	}
}