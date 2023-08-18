class D 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 20);
		System.out.println(i);
		System.out.println(j);
		// when we supply only i instead of expression,
		// Error: 
		// required: variable
		// found:    value
	}
}
