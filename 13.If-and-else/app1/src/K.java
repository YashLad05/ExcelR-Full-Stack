class K
{
	public static void main(String[] args) 
	{
		if(true)
			if(false)
				System.out.println("inner if");
			else
				System.out.println("inner else");
		else
			System.out.println("outer else");
	}
}
